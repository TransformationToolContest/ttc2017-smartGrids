/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ConstraintTermImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ConstraintTermImpl#getSecurityConstraintSum <em>Security Constraint Sum</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ConstraintTermImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintTermImpl extends IdentifiedObjectImpl implements ConstraintTerm {
	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected String factor = FACTOR_EDEFAULT;

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
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.CONSTRAINT_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(String newFactor) {
		String oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONSTRAINT_TERM__FACTOR, oldFactor, factor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM, oldSecurityConstraintSum, securityConstraintSum));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM, oldSecurityConstraintSum, newSecurityConstraintSum);
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
				msgs = ((InternalEObject)securityConstraintSum).eInverseRemove(this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS, SecurityConstraintSum.class, msgs);
			if (newSecurityConstraintSum != null)
				msgs = ((InternalEObject)newSecurityConstraintSum).eInverseAdd(this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS, SecurityConstraintSum.class, msgs);
			msgs = basicSetSecurityConstraintSum(newSecurityConstraintSum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM, newSecurityConstraintSum, newSecurityConstraintSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CONSTRAINT_TERM__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM:
				if (securityConstraintSum != null)
					msgs = ((InternalEObject)securityConstraintSum).eInverseRemove(this, MarketOperationsPackage.SECURITY_CONSTRAINT_SUM__CONSTRAINT_TERMS, SecurityConstraintSum.class, msgs);
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
			case MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM:
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
			case MarketOperationsPackage.CONSTRAINT_TERM__FACTOR:
				return getFactor();
			case MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM:
				if (resolve) return getSecurityConstraintSum();
				return basicGetSecurityConstraintSum();
			case MarketOperationsPackage.CONSTRAINT_TERM__FUNCTION:
				return getFunction();
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
			case MarketOperationsPackage.CONSTRAINT_TERM__FACTOR:
				setFactor((String)newValue);
				return;
			case MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM:
				setSecurityConstraintSum((SecurityConstraintSum)newValue);
				return;
			case MarketOperationsPackage.CONSTRAINT_TERM__FUNCTION:
				setFunction((String)newValue);
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
			case MarketOperationsPackage.CONSTRAINT_TERM__FACTOR:
				setFactor(FACTOR_EDEFAULT);
				return;
			case MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM:
				setSecurityConstraintSum((SecurityConstraintSum)null);
				return;
			case MarketOperationsPackage.CONSTRAINT_TERM__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
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
			case MarketOperationsPackage.CONSTRAINT_TERM__FACTOR:
				return FACTOR_EDEFAULT == null ? factor != null : !FACTOR_EDEFAULT.equals(factor);
			case MarketOperationsPackage.CONSTRAINT_TERM__SECURITY_CONSTRAINT_SUM:
				return securityConstraintSum != null;
			case MarketOperationsPackage.CONSTRAINT_TERM__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
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
		result.append(" (factor: ");
		result.append(factor);
		result.append(", function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

} //ConstraintTermImpl
