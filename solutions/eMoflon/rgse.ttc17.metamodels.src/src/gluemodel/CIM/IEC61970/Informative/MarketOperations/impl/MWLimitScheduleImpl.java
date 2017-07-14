/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.CurveImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MW Limit Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MWLimitScheduleImpl#getSecurityConstraintLimit <em>Security Constraint Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MWLimitScheduleImpl extends CurveImpl implements MWLimitSchedule {
	/**
	 * The cached value of the '{@link #getSecurityConstraintLimit() <em>Security Constraint Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityConstraintLimit()
	 * @generated
	 * @ordered
	 */
	protected ContingencyConstraintLimit securityConstraintLimit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MWLimitScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.MW_LIMIT_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContingencyConstraintLimit getSecurityConstraintLimit() {
		if (securityConstraintLimit != null && securityConstraintLimit.eIsProxy()) {
			InternalEObject oldSecurityConstraintLimit = (InternalEObject)securityConstraintLimit;
			securityConstraintLimit = (ContingencyConstraintLimit)eResolveProxy(oldSecurityConstraintLimit);
			if (securityConstraintLimit != oldSecurityConstraintLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT, oldSecurityConstraintLimit, securityConstraintLimit));
			}
		}
		return securityConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContingencyConstraintLimit basicGetSecurityConstraintLimit() {
		return securityConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityConstraintLimit(ContingencyConstraintLimit newSecurityConstraintLimit, NotificationChain msgs) {
		ContingencyConstraintLimit oldSecurityConstraintLimit = securityConstraintLimit;
		securityConstraintLimit = newSecurityConstraintLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT, oldSecurityConstraintLimit, newSecurityConstraintLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityConstraintLimit(ContingencyConstraintLimit newSecurityConstraintLimit) {
		if (newSecurityConstraintLimit != securityConstraintLimit) {
			NotificationChain msgs = null;
			if (securityConstraintLimit != null)
				msgs = ((InternalEObject)securityConstraintLimit).eInverseRemove(this, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES, ContingencyConstraintLimit.class, msgs);
			if (newSecurityConstraintLimit != null)
				msgs = ((InternalEObject)newSecurityConstraintLimit).eInverseAdd(this, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES, ContingencyConstraintLimit.class, msgs);
			msgs = basicSetSecurityConstraintLimit(newSecurityConstraintLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT, newSecurityConstraintLimit, newSecurityConstraintLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT:
				if (securityConstraintLimit != null)
					msgs = ((InternalEObject)securityConstraintLimit).eInverseRemove(this, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES, ContingencyConstraintLimit.class, msgs);
				return basicSetSecurityConstraintLimit((ContingencyConstraintLimit)otherEnd, msgs);
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
			case MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT:
				return basicSetSecurityConstraintLimit(null, msgs);
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
			case MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT:
				if (resolve) return getSecurityConstraintLimit();
				return basicGetSecurityConstraintLimit();
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
			case MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT:
				setSecurityConstraintLimit((ContingencyConstraintLimit)newValue);
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
			case MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT:
				setSecurityConstraintLimit((ContingencyConstraintLimit)null);
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
			case MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT:
				return securityConstraintLimit != null;
		}
		return super.eIsSet(featureID);
	}

} //MWLimitScheduleImpl
