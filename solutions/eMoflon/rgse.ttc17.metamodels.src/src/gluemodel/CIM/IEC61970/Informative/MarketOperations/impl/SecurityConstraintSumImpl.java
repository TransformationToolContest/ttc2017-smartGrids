/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum;

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
 * An implementation of the model object '<em><b>Security Constraint Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintSumImpl#getContingencyConstraintLimits <em>Contingency Constraint Limits</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintSumImpl#getDefaultConstraintLimit <em>Default Constraint Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintSumImpl#getBaseCaseConstraintLimit <em>Base Case Constraint Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintSumImpl#getConstraintTerms <em>Constraint Terms</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintSumImpl#getRTO <em>RTO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityConstraintSumImpl extends MarketFactorsImpl implements SecurityConstraintSum {
	/**
	 * The cached value of the '{@link #getContingencyConstraintLimits() <em>Contingency Constraint Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingencyConstraintLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<ContingencyConstraintLimit> contingencyConstraintLimits;

	/**
	 * The cached value of the '{@link #getDefaultConstraintLimit() <em>Default Constraint Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConstraintLimit()
	 * @generated
	 * @ordered
	 */
	protected DefaultConstraintLimit defaultConstraintLimit;

	/**
	 * The cached value of the '{@link #getBaseCaseConstraintLimit() <em>Base Case Constraint Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCaseConstraintLimit()
	 * @generated
	 * @ordered
	 */
	protected BaseCaseConstraintLimit baseCaseConstraintLimit;

	/**
	 * The cached value of the '{@link #getConstraintTerms() <em>Constraint Terms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintTerm> constraintTerms;

	/**
	 * The cached value of the '{@link #getRTO() <em>RTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTO()
	 * @generated
	 * @ordered
	 */
	protected RTO rto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityConstraintSumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.SECURITY_CONSTRAINT_SUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContingencyConstraintLimit> getContingencyConstraintLimits() {
		if (contingencyConstraintLimits == null) {
			contingencyConstraintLimits = new EObjectWithInverseResolvingEList<ContingencyConstraintLimit>(ContingencyConstraintLimit.class, this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM);
		}
		return contingencyConstraintLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultConstraintLimit getDefaultConstraintLimit() {
		if (defaultConstraintLimit != null && defaultConstraintLimit.eIsProxy()) {
			InternalEObject oldDefaultConstraintLimit = (InternalEObject)defaultConstraintLimit;
			defaultConstraintLimit = (DefaultConstraintLimit)eResolveProxy(oldDefaultConstraintLimit);
			if (defaultConstraintLimit != oldDefaultConstraintLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT, oldDefaultConstraintLimit, defaultConstraintLimit));
			}
		}
		return defaultConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultConstraintLimit basicGetDefaultConstraintLimit() {
		return defaultConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultConstraintLimit(DefaultConstraintLimit newDefaultConstraintLimit, NotificationChain msgs) {
		DefaultConstraintLimit oldDefaultConstraintLimit = defaultConstraintLimit;
		defaultConstraintLimit = newDefaultConstraintLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT, oldDefaultConstraintLimit, newDefaultConstraintLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultConstraintLimit(DefaultConstraintLimit newDefaultConstraintLimit) {
		if (newDefaultConstraintLimit != defaultConstraintLimit) {
			NotificationChain msgs = null;
			if (defaultConstraintLimit != null)
				msgs = ((InternalEObject)defaultConstraintLimit).eInverseRemove(this, MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, DefaultConstraintLimit.class, msgs);
			if (newDefaultConstraintLimit != null)
				msgs = ((InternalEObject)newDefaultConstraintLimit).eInverseAdd(this, MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, DefaultConstraintLimit.class, msgs);
			msgs = basicSetDefaultConstraintLimit(newDefaultConstraintLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT, newDefaultConstraintLimit, newDefaultConstraintLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseCaseConstraintLimit getBaseCaseConstraintLimit() {
		if (baseCaseConstraintLimit != null && baseCaseConstraintLimit.eIsProxy()) {
			InternalEObject oldBaseCaseConstraintLimit = (InternalEObject)baseCaseConstraintLimit;
			baseCaseConstraintLimit = (BaseCaseConstraintLimit)eResolveProxy(oldBaseCaseConstraintLimit);
			if (baseCaseConstraintLimit != oldBaseCaseConstraintLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT, oldBaseCaseConstraintLimit, baseCaseConstraintLimit));
			}
		}
		return baseCaseConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseCaseConstraintLimit basicGetBaseCaseConstraintLimit() {
		return baseCaseConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseCaseConstraintLimit(BaseCaseConstraintLimit newBaseCaseConstraintLimit, NotificationChain msgs) {
		BaseCaseConstraintLimit oldBaseCaseConstraintLimit = baseCaseConstraintLimit;
		baseCaseConstraintLimit = newBaseCaseConstraintLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT, oldBaseCaseConstraintLimit, newBaseCaseConstraintLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCaseConstraintLimit(BaseCaseConstraintLimit newBaseCaseConstraintLimit) {
		if (newBaseCaseConstraintLimit != baseCaseConstraintLimit) {
			NotificationChain msgs = null;
			if (baseCaseConstraintLimit != null)
				msgs = ((InternalEObject)baseCaseConstraintLimit).eInverseRemove(this, MarketOperationsPackage.BASE_CASE_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, BaseCaseConstraintLimit.class, msgs);
			if (newBaseCaseConstraintLimit != null)
				msgs = ((InternalEObject)newBaseCaseConstraintLimit).eInverseAdd(this, MarketOperationsPackage.BASE_CASE_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, BaseCaseConstraintLimit.class, msgs);
			msgs = basicSetBaseCaseConstraintLimit(newBaseCaseConstraintLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT, newBaseCaseConstraintLimit, newBaseCaseConstraintLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintTerm> getConstraintTerms() {
		if (constraintTerms == null) {
			constraintTerms = new EObjectWithInverseResolvingEList<ConstraintTerm>(ConstraintTerm.class, this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS, MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM);
		}
		return constraintTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO getRTO() {
		if (rto != null && rto.eIsProxy()) {
			InternalEObject oldRTO = (InternalEObject)rto;
			rto = (RTO)eResolveProxy(oldRTO);
			if (rto != oldRTO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO, oldRTO, rto));
			}
		}
		return rto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO basicGetRTO() {
		return rto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRTO(RTO newRTO, NotificationChain msgs) {
		RTO oldRTO = rto;
		rto = newRTO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO, oldRTO, newRTO);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRTO(RTO newRTO) {
		if (newRTO != rto) {
			NotificationChain msgs = null;
			if (rto != null)
				msgs = ((InternalEObject)rto).eInverseRemove(this, MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR, RTO.class, msgs);
			if (newRTO != null)
				msgs = ((InternalEObject)newRTO).eInverseAdd(this, MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR, RTO.class, msgs);
			msgs = basicSetRTO(newRTO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO, newRTO, newRTO));
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
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContingencyConstraintLimits()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT:
				if (defaultConstraintLimit != null)
					msgs = ((InternalEObject)defaultConstraintLimit).eInverseRemove(this, MarketOperationsPackage.DEFAULT_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, DefaultConstraintLimit.class, msgs);
				return basicSetDefaultConstraintLimit((DefaultConstraintLimit)otherEnd, msgs);
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT:
				if (baseCaseConstraintLimit != null)
					msgs = ((InternalEObject)baseCaseConstraintLimit).eInverseRemove(this, MarketOperationsPackage.BASE_CASE_CONSTRAINT_LIMIT__SECURITY_CONSTRAINT_SUM, BaseCaseConstraintLimit.class, msgs);
				return basicSetBaseCaseConstraintLimit((BaseCaseConstraintLimit)otherEnd, msgs);
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraintTerms()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO:
				if (rto != null)
					msgs = ((InternalEObject)rto).eInverseRemove(this, MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS_LINEAR, RTO.class, msgs);
				return basicSetRTO((RTO)otherEnd, msgs);
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
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS:
				return ((InternalEList<?>)getContingencyConstraintLimits()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT:
				return basicSetDefaultConstraintLimit(null, msgs);
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT:
				return basicSetBaseCaseConstraintLimit(null, msgs);
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS:
				return ((InternalEList<?>)getConstraintTerms()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO:
				return basicSetRTO(null, msgs);
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
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS:
				return getContingencyConstraintLimits();
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT:
				if (resolve) return getDefaultConstraintLimit();
				return basicGetDefaultConstraintLimit();
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT:
				if (resolve) return getBaseCaseConstraintLimit();
				return basicGetBaseCaseConstraintLimit();
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS:
				return getConstraintTerms();
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO:
				if (resolve) return getRTO();
				return basicGetRTO();
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
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS:
				getContingencyConstraintLimits().clear();
				getContingencyConstraintLimits().addAll((Collection<? extends ContingencyConstraintLimit>)newValue);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT:
				setDefaultConstraintLimit((DefaultConstraintLimit)newValue);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT:
				setBaseCaseConstraintLimit((BaseCaseConstraintLimit)newValue);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS:
				getConstraintTerms().clear();
				getConstraintTerms().addAll((Collection<? extends ConstraintTerm>)newValue);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO:
				setRTO((RTO)newValue);
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
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS:
				getContingencyConstraintLimits().clear();
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT:
				setDefaultConstraintLimit((DefaultConstraintLimit)null);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT:
				setBaseCaseConstraintLimit((BaseCaseConstraintLimit)null);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS:
				getConstraintTerms().clear();
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO:
				setRTO((RTO)null);
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
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONTINGENCY_CONSTRAINT_LIMITS:
				return contingencyConstraintLimits != null && !contingencyConstraintLimits.isEmpty();
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__DEFAULT_CONSTRAINT_LIMIT:
				return defaultConstraintLimit != null;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__BASE_CASE_CONSTRAINT_LIMIT:
				return baseCaseConstraintLimit != null;
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS:
				return constraintTerms != null && !constraintTerms.isEmpty();
			case MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__RTO:
				return rto != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityConstraintSumImpl
