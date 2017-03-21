/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Constraint Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.DefaultConstraintLimitImpl#getSecurityConstraintSum <em>Security Constraint Sum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultConstraintLimitImpl extends CurveImpl implements DefaultConstraintLimit {
	/**
	 * The cached value of the '{@link #getSecurityConstraintSum() <em>Security Constraint Sum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityConstraintSum()
	 * @generated
	 * @ordered
	 */
	protected SecurityConstraintSum securityConstraintSum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultConstraintLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.DEFAULT_CONSTRAINT_LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConstraintSum getSecurityConstraintSum() {
		if (securityConstraintSum != null && securityConstraintSum.eIsProxy()) {
			InternalEObject oldSecurityConstraintSum = (InternalEObject)securityConstraintSum;
			securityConstraintSum = (SecurityConstraintSum)eResolveProxy(oldSecurityConstraintSum);
			if (securityConstraintSum != oldSecurityConstraintSum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, oldSecurityConstraintSum, securityConstraintSum));
			}
		}
		return securityConstraintSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConstraintSum basicGetSecurityConstraintSum() {
		return securityConstraintSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityConstraintSum(SecurityConstraintSum newSecurityConstraintSum, NotificationChain msgs) {
		SecurityConstraintSum oldSecurityConstraintSum = securityConstraintSum;
		securityConstraintSum = newSecurityConstraintSum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, oldSecurityConstraintSum, newSecurityConstraintSum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityConstraintSum(SecurityConstraintSum newSecurityConstraintSum) {
		if (newSecurityConstraintSum != securityConstraintSum) {
			NotificationChain msgs = null;
			if (securityConstraintSum != null)
				msgs = ((InternalEObject)securityConstraintSum).eInverseRemove(this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT, SecurityConstraintSum.class, msgs);
			if (newSecurityConstraintSum != null)
				msgs = ((InternalEObject)newSecurityConstraintSum).eInverseAdd(this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT, SecurityConstraintSum.class, msgs);
			msgs = basicSetSecurityConstraintSum(newSecurityConstraintSum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, newSecurityConstraintSum, newSecurityConstraintSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				if (securityConstraintSum != null)
					msgs = ((InternalEObject)securityConstraintSum).eInverseRemove(this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT, SecurityConstraintSum.class, msgs);
				return basicSetSecurityConstraintSum((SecurityConstraintSum)otherEnd, msgs);
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
			case MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				return basicSetSecurityConstraintSum(null, msgs);
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
			case MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				if (resolve) return getSecurityConstraintSum();
				return basicGetSecurityConstraintSum();
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
			case MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				setSecurityConstraintSum((SecurityConstraintSum)newValue);
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
			case MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				setSecurityConstraintSum((SecurityConstraintSum)null);
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
			case MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				return securityConstraintSum != null;
		}
		return super.eIsSet(featureID);
	}

} //DefaultConstraintLimitImpl
