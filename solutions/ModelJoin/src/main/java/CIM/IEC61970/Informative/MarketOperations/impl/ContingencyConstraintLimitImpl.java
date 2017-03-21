/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Contingency.Contingency;
import CIM.IEC61970.Contingency.ContingencyPackage;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit;
import CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contingency Constraint Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ContingencyConstraintLimitImpl#getSecurityConstraintSum <em>Security Constraint Sum</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ContingencyConstraintLimitImpl#getMWLimitSchedules <em>MW Limit Schedules</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ContingencyConstraintLimitImpl#getContingency <em>Contingency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContingencyConstraintLimitImpl extends CurveImpl implements ContingencyConstraintLimit {
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
	 * The cached value of the '{@link #getMWLimitSchedules() <em>MW Limit Schedules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWLimitSchedules()
	 * @generated
	 * @ordered
	 */
	protected MWLimitSchedule mwLimitSchedules;

	/**
	 * The cached value of the '{@link #getContingency() <em>Contingency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingency()
	 * @generated
	 * @ordered
	 */
	protected Contingency contingency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContingencyConstraintLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.CONTINGENCY_CONSTRAINT_LIMIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, oldSecurityConstraintSum, securityConstraintSum));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, oldSecurityConstraintSum, newSecurityConstraintSum);
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
				msgs = ((InternalEObject)securityConstraintSum).eInverseRemove(this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS, SecurityConstraintSum.class, msgs);
			if (newSecurityConstraintSum != null)
				msgs = ((InternalEObject)newSecurityConstraintSum).eInverseAdd(this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS, SecurityConstraintSum.class, msgs);
			msgs = basicSetSecurityConstraintSum(newSecurityConstraintSum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, newSecurityConstraintSum, newSecurityConstraintSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWLimitSchedule getMWLimitSchedules() {
		if (mwLimitSchedules != null && mwLimitSchedules.eIsProxy()) {
			InternalEObject oldMWLimitSchedules = (InternalEObject)mwLimitSchedules;
			mwLimitSchedules = (MWLimitSchedule)eResolveProxy(oldMWLimitSchedules);
			if (mwLimitSchedules != oldMWLimitSchedules) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES, oldMWLimitSchedules, mwLimitSchedules));
			}
		}
		return mwLimitSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWLimitSchedule basicGetMWLimitSchedules() {
		return mwLimitSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWLimitSchedules(MWLimitSchedule newMWLimitSchedules, NotificationChain msgs) {
		MWLimitSchedule oldMWLimitSchedules = mwLimitSchedules;
		mwLimitSchedules = newMWLimitSchedules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES, oldMWLimitSchedules, newMWLimitSchedules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMWLimitSchedules(MWLimitSchedule newMWLimitSchedules) {
		if (newMWLimitSchedules != mwLimitSchedules) {
			NotificationChain msgs = null;
			if (mwLimitSchedules != null)
				msgs = ((InternalEObject)mwLimitSchedules).eInverseRemove(this, MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT, MWLimitSchedule.class, msgs);
			if (newMWLimitSchedules != null)
				msgs = ((InternalEObject)newMWLimitSchedules).eInverseAdd(this, MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT, MWLimitSchedule.class, msgs);
			msgs = basicSetMWLimitSchedules(newMWLimitSchedules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES, newMWLimitSchedules, newMWLimitSchedules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contingency getContingency() {
		if (contingency != null && contingency.eIsProxy()) {
			InternalEObject oldContingency = (InternalEObject)contingency;
			contingency = (Contingency)eResolveProxy(oldContingency);
			if (contingency != oldContingency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY, oldContingency, contingency));
			}
		}
		return contingency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contingency basicGetContingency() {
		return contingency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContingency(Contingency newContingency, NotificationChain msgs) {
		Contingency oldContingency = contingency;
		contingency = newContingency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY, oldContingency, newContingency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContingency(Contingency newContingency) {
		if (newContingency != contingency) {
			NotificationChain msgs = null;
			if (contingency != null)
				msgs = ((InternalEObject)contingency).eInverseRemove(this, ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT, Contingency.class, msgs);
			if (newContingency != null)
				msgs = ((InternalEObject)newContingency).eInverseAdd(this, ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT, Contingency.class, msgs);
			msgs = basicSetContingency(newContingency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY, newContingency, newContingency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				if (securityConstraintSum != null)
					msgs = ((InternalEObject)securityConstraintSum).eInverseRemove(this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS, SecurityConstraintSum.class, msgs);
				return basicSetSecurityConstraintSum((SecurityConstraintSum)otherEnd, msgs);
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES:
				if (mwLimitSchedules != null)
					msgs = ((InternalEObject)mwLimitSchedules).eInverseRemove(this, MarketOperationsPackage.MW_LIMIT_SCHEDULE__SECURITY_CONSTRAINT_LIMIT, MWLimitSchedule.class, msgs);
				return basicSetMWLimitSchedules((MWLimitSchedule)otherEnd, msgs);
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY:
				if (contingency != null)
					msgs = ((InternalEObject)contingency).eInverseRemove(this, ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT, Contingency.class, msgs);
				return basicSetContingency((Contingency)otherEnd, msgs);
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
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				return basicSetSecurityConstraintSum(null, msgs);
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES:
				return basicSetMWLimitSchedules(null, msgs);
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY:
				return basicSetContingency(null, msgs);
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
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				if (resolve) return getSecurityConstraintSum();
				return basicGetSecurityConstraintSum();
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES:
				if (resolve) return getMWLimitSchedules();
				return basicGetMWLimitSchedules();
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY:
				if (resolve) return getContingency();
				return basicGetContingency();
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
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				setSecurityConstraintSum((SecurityConstraintSum)newValue);
				return;
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES:
				setMWLimitSchedules((MWLimitSchedule)newValue);
				return;
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY:
				setContingency((Contingency)newValue);
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
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				setSecurityConstraintSum((SecurityConstraintSum)null);
				return;
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES:
				setMWLimitSchedules((MWLimitSchedule)null);
				return;
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY:
				setContingency((Contingency)null);
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
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM:
				return securityConstraintSum != null;
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__MW_LIMIT_SCHEDULES:
				return mwLimitSchedules != null;
			case MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY:
				return contingency != null;
		}
		return super.eIsSet(featureID);
	}

} //ContingencyConstraintLimitImpl
