/**
 */
package CIM.IEC61970.Informative.Financial.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.Financial.FinancialPackage;
import CIM.IEC61970.Informative.Financial.TransmissionProduct;
import CIM.IEC61970.Informative.Financial.TransmissionProvider;

import CIM.IEC61970.Informative.Reservation.ReservationPackage;
import CIM.IEC61970.Informative.Reservation.TransmissionPath;
import CIM.IEC61970.Informative.Reservation.TransmissionService;

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
 * An implementation of the model object '<em><b>Transmission Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.TransmissionProductImpl#getTransmissionProductType <em>Transmission Product Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.TransmissionProductImpl#getLocationFor <em>Location For</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.TransmissionProductImpl#getTransmissionProvider <em>Transmission Provider</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.impl.TransmissionProductImpl#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionProductImpl extends IdentifiedObjectImpl implements TransmissionProduct {
	/**
	 * The default value of the '{@link #getTransmissionProductType() <em>Transmission Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionProductType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TRANSMISSION_PRODUCT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmissionProductType() <em>Transmission Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionProductType()
	 * @generated
	 * @ordered
	 */
	protected Object transmissionProductType = TRANSMISSION_PRODUCT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocationFor() <em>Location For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationFor()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionPath> locationFor;

	/**
	 * The cached value of the '{@link #getTransmissionProvider() <em>Transmission Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionProvider()
	 * @generated
	 * @ordered
	 */
	protected TransmissionProvider transmissionProvider;

	/**
	 * The cached value of the '{@link #getOffers() <em>Offers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionService> offers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancialPackage.Literals.TRANSMISSION_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTransmissionProductType() {
		return transmissionProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionProductType(Object newTransmissionProductType) {
		Object oldTransmissionProductType = transmissionProductType;
		transmissionProductType = newTransmissionProductType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PRODUCT_TYPE, oldTransmissionProductType, transmissionProductType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionPath> getLocationFor() {
		if (locationFor == null) {
			locationFor = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionPath>(TransmissionPath.class, this, FinancialPackage.TRANSMISSION_PRODUCT__LOCATION_FOR, ReservationPackage.TRANSMISSION_PATH__LOCATED_ON);
		}
		return locationFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProvider getTransmissionProvider() {
		if (transmissionProvider != null && transmissionProvider.eIsProxy()) {
			InternalEObject oldTransmissionProvider = (InternalEObject)transmissionProvider;
			transmissionProvider = (TransmissionProvider)eResolveProxy(oldTransmissionProvider);
			if (transmissionProvider != oldTransmissionProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER, oldTransmissionProvider, transmissionProvider));
			}
		}
		return transmissionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProvider basicGetTransmissionProvider() {
		return transmissionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionProvider(TransmissionProvider newTransmissionProvider, NotificationChain msgs) {
		TransmissionProvider oldTransmissionProvider = transmissionProvider;
		transmissionProvider = newTransmissionProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER, oldTransmissionProvider, newTransmissionProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionProvider(TransmissionProvider newTransmissionProvider) {
		if (newTransmissionProvider != transmissionProvider) {
			NotificationChain msgs = null;
			if (transmissionProvider != null)
				msgs = ((InternalEObject)transmissionProvider).eInverseRemove(this, FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS, TransmissionProvider.class, msgs);
			if (newTransmissionProvider != null)
				msgs = ((InternalEObject)newTransmissionProvider).eInverseAdd(this, FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS, TransmissionProvider.class, msgs);
			msgs = basicSetTransmissionProvider(newTransmissionProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER, newTransmissionProvider, newTransmissionProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionService> getOffers() {
		if (offers == null) {
			offers = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionService>(TransmissionService.class, this, FinancialPackage.TRANSMISSION_PRODUCT__OFFERS, ReservationPackage.TRANSMISSION_SERVICE__OFFERED_AS);
		}
		return offers;
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
			case FinancialPackage.TRANSMISSION_PRODUCT__LOCATION_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocationFor()).basicAdd(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER:
				if (transmissionProvider != null)
					msgs = ((InternalEObject)transmissionProvider).eInverseRemove(this, FinancialPackage.TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS, TransmissionProvider.class, msgs);
				return basicSetTransmissionProvider((TransmissionProvider)otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PRODUCT__OFFERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffers()).basicAdd(otherEnd, msgs);
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
			case FinancialPackage.TRANSMISSION_PRODUCT__LOCATION_FOR:
				return ((InternalEList<?>)getLocationFor()).basicRemove(otherEnd, msgs);
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER:
				return basicSetTransmissionProvider(null, msgs);
			case FinancialPackage.TRANSMISSION_PRODUCT__OFFERS:
				return ((InternalEList<?>)getOffers()).basicRemove(otherEnd, msgs);
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
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PRODUCT_TYPE:
				return getTransmissionProductType();
			case FinancialPackage.TRANSMISSION_PRODUCT__LOCATION_FOR:
				return getLocationFor();
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER:
				if (resolve) return getTransmissionProvider();
				return basicGetTransmissionProvider();
			case FinancialPackage.TRANSMISSION_PRODUCT__OFFERS:
				return getOffers();
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
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PRODUCT_TYPE:
				setTransmissionProductType(newValue);
				return;
			case FinancialPackage.TRANSMISSION_PRODUCT__LOCATION_FOR:
				getLocationFor().clear();
				getLocationFor().addAll((Collection<? extends TransmissionPath>)newValue);
				return;
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER:
				setTransmissionProvider((TransmissionProvider)newValue);
				return;
			case FinancialPackage.TRANSMISSION_PRODUCT__OFFERS:
				getOffers().clear();
				getOffers().addAll((Collection<? extends TransmissionService>)newValue);
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
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PRODUCT_TYPE:
				setTransmissionProductType(TRANSMISSION_PRODUCT_TYPE_EDEFAULT);
				return;
			case FinancialPackage.TRANSMISSION_PRODUCT__LOCATION_FOR:
				getLocationFor().clear();
				return;
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER:
				setTransmissionProvider((TransmissionProvider)null);
				return;
			case FinancialPackage.TRANSMISSION_PRODUCT__OFFERS:
				getOffers().clear();
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
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PRODUCT_TYPE:
				return TRANSMISSION_PRODUCT_TYPE_EDEFAULT == null ? transmissionProductType != null : !TRANSMISSION_PRODUCT_TYPE_EDEFAULT.equals(transmissionProductType);
			case FinancialPackage.TRANSMISSION_PRODUCT__LOCATION_FOR:
				return locationFor != null && !locationFor.isEmpty();
			case FinancialPackage.TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER:
				return transmissionProvider != null;
			case FinancialPackage.TRANSMISSION_PRODUCT__OFFERS:
				return offers != null && !offers.isEmpty();
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
		result.append(" (transmissionProductType: ");
		result.append(transmissionProductType);
		result.append(')');
		return result.toString();
	}

} //TransmissionProductImpl
