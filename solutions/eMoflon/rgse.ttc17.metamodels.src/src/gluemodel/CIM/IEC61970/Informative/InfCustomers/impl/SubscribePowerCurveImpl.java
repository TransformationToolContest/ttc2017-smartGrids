/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCustomers.impl;

import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.PricingStructure;

import gluemodel.CIM.IEC61970.Core.impl.CurveImpl;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscribe Power Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.SubscribePowerCurveImpl#getPricingStructure <em>Pricing Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscribePowerCurveImpl extends CurveImpl implements SubscribePowerCurve {
	/**
	 * The cached value of the '{@link #getPricingStructure() <em>Pricing Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructure()
	 * @generated
	 * @ordered
	 */
	protected PricingStructure pricingStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscribePowerCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCustomersPackage.Literals.SUBSCRIBE_POWER_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingStructure getPricingStructure() {
		if (pricingStructure != null && pricingStructure.eIsProxy()) {
			InternalEObject oldPricingStructure = (InternalEObject)pricingStructure;
			pricingStructure = (PricingStructure)eResolveProxy(oldPricingStructure);
			if (pricingStructure != oldPricingStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE, oldPricingStructure, pricingStructure));
			}
		}
		return pricingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingStructure basicGetPricingStructure() {
		return pricingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPricingStructure(PricingStructure newPricingStructure, NotificationChain msgs) {
		PricingStructure oldPricingStructure = pricingStructure;
		pricingStructure = newPricingStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE, oldPricingStructure, newPricingStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricingStructure(PricingStructure newPricingStructure) {
		if (newPricingStructure != pricingStructure) {
			NotificationChain msgs = null;
			if (pricingStructure != null)
				msgs = ((InternalEObject)pricingStructure).eInverseRemove(this, CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE, PricingStructure.class, msgs);
			if (newPricingStructure != null)
				msgs = ((InternalEObject)newPricingStructure).eInverseAdd(this, CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE, PricingStructure.class, msgs);
			msgs = basicSetPricingStructure(newPricingStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE, newPricingStructure, newPricingStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE:
				if (pricingStructure != null)
					msgs = ((InternalEObject)pricingStructure).eInverseRemove(this, CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE, PricingStructure.class, msgs);
				return basicSetPricingStructure((PricingStructure)otherEnd, msgs);
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
			case InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE:
				return basicSetPricingStructure(null, msgs);
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
			case InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE:
				if (resolve) return getPricingStructure();
				return basicGetPricingStructure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE:
				setPricingStructure((PricingStructure)newValue);
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
			case InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE:
				setPricingStructure((PricingStructure)null);
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
			case InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE:
				return pricingStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscribePowerCurveImpl
