/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.Common.ElectronicAddress;

import gluemodel.CIM.IEC61968.PaymentMetering.Cashier;
import gluemodel.CIM.IEC61968.PaymentMetering.CashierShift;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Vendor;

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
 * An implementation of the model object '<em><b>Cashier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CashierImpl#getCashierShifts <em>Cashier Shifts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CashierImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CashierImpl#getVendor <em>Vendor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashierImpl extends IdentifiedObjectImpl implements Cashier {
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
	 * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected ElectronicAddress electronicAddress;

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
	protected CashierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CASHIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CashierShift> getCashierShifts() {
		if (cashierShifts == null) {
			cashierShifts = new EObjectWithInverseResolvingEList<CashierShift>(CashierShift.class, this, PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS, PaymentMeteringPackage.CASHIER_SHIFT__CASHIER);
		}
		return cashierShifts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress getElectronicAddress() {
		if (electronicAddress != null && electronicAddress.eIsProxy()) {
			InternalEObject oldElectronicAddress = (InternalEObject)electronicAddress;
			electronicAddress = (ElectronicAddress)eResolveProxy(oldElectronicAddress);
			if (electronicAddress != oldElectronicAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
			}
		}
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress basicGetElectronicAddress() {
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicAddress(ElectronicAddress newElectronicAddress) {
		ElectronicAddress oldElectronicAddress = electronicAddress;
		electronicAddress = newElectronicAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.CASHIER__VENDOR, oldVendor, vendor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CASHIER__VENDOR, oldVendor, newVendor);
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
				msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__CASHIERS, Vendor.class, msgs);
			if (newVendor != null)
				msgs = ((InternalEObject)newVendor).eInverseAdd(this, PaymentMeteringPackage.VENDOR__CASHIERS, Vendor.class, msgs);
			msgs = basicSetVendor(newVendor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CASHIER__VENDOR, newVendor, newVendor));
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
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCashierShifts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER__VENDOR:
				if (vendor != null)
					msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__CASHIERS, Vendor.class, msgs);
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
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				return ((InternalEList<?>)getCashierShifts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER__VENDOR:
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
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				return getCashierShifts();
			case PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS:
				if (resolve) return getElectronicAddress();
				return basicGetElectronicAddress();
			case PaymentMeteringPackage.CASHIER__VENDOR:
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
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				getCashierShifts().clear();
				getCashierShifts().addAll((Collection<? extends CashierShift>)newValue);
				return;
			case PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case PaymentMeteringPackage.CASHIER__VENDOR:
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
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				getCashierShifts().clear();
				return;
			case PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case PaymentMeteringPackage.CASHIER__VENDOR:
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
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				return cashierShifts != null && !cashierShifts.isEmpty();
			case PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case PaymentMeteringPackage.CASHIER__VENDOR:
				return vendor != null;
		}
		return super.eIsSet(featureID);
	}

} //CashierImpl
