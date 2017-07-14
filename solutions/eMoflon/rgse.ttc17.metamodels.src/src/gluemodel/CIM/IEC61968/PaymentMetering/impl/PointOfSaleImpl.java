/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.CashierShift;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale;
import gluemodel.CIM.IEC61968.PaymentMetering.Vendor;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Token;

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
 * An implementation of the model object '<em><b>Point Of Sale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.PointOfSaleImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.PointOfSaleImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.PointOfSaleImpl#getCashierShifts <em>Cashier Shifts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.PointOfSaleImpl#getVendor <em>Vendor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointOfSaleImpl extends IdentifiedObjectImpl implements PointOfSale {
	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCashierShifts() <em>Cashier Shifts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashierShifts()
	 * @generated
	 * @ordered
	 */
	protected EList<CashierShift> cashierShifts;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected Vendor vendor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointOfSaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.POINT_OF_SALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectWithInverseResolvingEList<Token>(Token.class, this, PaymentMeteringPackage.POINT_OF_SALE__TOKENS, InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.POINT_OF_SALE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CashierShift> getCashierShifts() {
		if (cashierShifts == null) {
			cashierShifts = new EObjectWithInverseResolvingEList<CashierShift>(CashierShift.class, this, PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS, PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE);
		}
		return cashierShifts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor getVendor() {
		if (vendor != null && vendor.eIsProxy()) {
			InternalEObject oldVendor = (InternalEObject)vendor;
			vendor = (Vendor)eResolveProxy(oldVendor);
			if (vendor != oldVendor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.POINT_OF_SALE__VENDOR, oldVendor, vendor));
			}
		}
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor basicGetVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendor(Vendor newVendor, NotificationChain msgs) {
		Vendor oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.POINT_OF_SALE__VENDOR, oldVendor, newVendor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(Vendor newVendor) {
		if (newVendor != vendor) {
			NotificationChain msgs = null;
			if (vendor != null)
				msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__POINT_OF_SALES, Vendor.class, msgs);
			if (newVendor != null)
				msgs = ((InternalEObject)newVendor).eInverseAdd(this, PaymentMeteringPackage.VENDOR__POINT_OF_SALES, Vendor.class, msgs);
			msgs = basicSetVendor(newVendor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.POINT_OF_SALE__VENDOR, newVendor, newVendor));
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
			case PaymentMeteringPackage.POINT_OF_SALE__TOKENS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTokens()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCashierShifts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.POINT_OF_SALE__VENDOR:
				if (vendor != null)
					msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__POINT_OF_SALES, Vendor.class, msgs);
				return basicSetVendor((Vendor)otherEnd, msgs);
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
			case PaymentMeteringPackage.POINT_OF_SALE__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS:
				return ((InternalEList<?>)getCashierShifts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.POINT_OF_SALE__VENDOR:
				return basicSetVendor(null, msgs);
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
			case PaymentMeteringPackage.POINT_OF_SALE__TOKENS:
				return getTokens();
			case PaymentMeteringPackage.POINT_OF_SALE__LOCATION:
				return getLocation();
			case PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS:
				return getCashierShifts();
			case PaymentMeteringPackage.POINT_OF_SALE__VENDOR:
				if (resolve) return getVendor();
				return basicGetVendor();
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
			case PaymentMeteringPackage.POINT_OF_SALE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case PaymentMeteringPackage.POINT_OF_SALE__LOCATION:
				setLocation((String)newValue);
				return;
			case PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS:
				getCashierShifts().clear();
				getCashierShifts().addAll((Collection<? extends CashierShift>)newValue);
				return;
			case PaymentMeteringPackage.POINT_OF_SALE__VENDOR:
				setVendor((Vendor)newValue);
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
			case PaymentMeteringPackage.POINT_OF_SALE__TOKENS:
				getTokens().clear();
				return;
			case PaymentMeteringPackage.POINT_OF_SALE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS:
				getCashierShifts().clear();
				return;
			case PaymentMeteringPackage.POINT_OF_SALE__VENDOR:
				setVendor((Vendor)null);
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
			case PaymentMeteringPackage.POINT_OF_SALE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case PaymentMeteringPackage.POINT_OF_SALE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS:
				return cashierShifts != null && !cashierShifts.isEmpty();
			case PaymentMeteringPackage.POINT_OF_SALE__VENDOR:
				return vendor != null;
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
		result.append(" (location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //PointOfSaleImpl
