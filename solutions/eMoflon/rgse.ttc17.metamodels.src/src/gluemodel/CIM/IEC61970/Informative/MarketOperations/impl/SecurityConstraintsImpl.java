/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsImpl#getMinMW <em>Min MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsImpl#getMaxMW <em>Max MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsImpl#getRTO <em>RTO</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsImpl#getActualMW <em>Actual MW</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityConstraintsImpl extends IdentifiedObjectImpl implements SecurityConstraints {
	/**
	 * The default value of the '{@link #getMinMW() <em>Min MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMW()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinMW() <em>Min MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMW()
	 * @generated
	 * @ordered
	 */
	protected float minMW = MIN_MW_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxMW() <em>Max MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMW()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxMW() <em>Max MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMW()
	 * @generated
	 * @ordered
	 */
	protected float maxMW = MAX_MW_EDEFAULT;

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
	 * The default value of the '{@link #getActualMW() <em>Actual MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualMW()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTUAL_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActualMW() <em>Actual MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualMW()
	 * @generated
	 * @ordered
	 */
	protected float actualMW = ACTUAL_MW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.SECURITY_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinMW() {
		return minMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinMW(float newMinMW) {
		float oldMinMW = minMW;
		minMW = newMinMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINTS__MIN_MW, oldMinMW, minMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxMW() {
		return maxMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMW(float newMaxMW) {
		float oldMaxMW = maxMW;
		maxMW = newMaxMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINTS__MAX_MW, oldMaxMW, maxMW));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO, oldRTO, rto));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO, oldRTO, newRTO);
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
				msgs = ((InternalEObject)rto).eInverseRemove(this, MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS, RTO.class, msgs);
			if (newRTO != null)
				msgs = ((InternalEObject)newRTO).eInverseAdd(this, MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS, RTO.class, msgs);
			msgs = basicSetRTO(newRTO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO, newRTO, newRTO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getActualMW() {
		return actualMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualMW(float newActualMW) {
		float oldActualMW = actualMW;
		actualMW = newActualMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINTS__ACTUAL_MW, oldActualMW, actualMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO:
				if (rto != null)
					msgs = ((InternalEObject)rto).eInverseRemove(this, MarketOperationsPackage.RTO__SECURITY_CONSTRAINTS, RTO.class, msgs);
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
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO:
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
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__MIN_MW:
				return getMinMW();
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__MAX_MW:
				return getMaxMW();
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO:
				if (resolve) return getRTO();
				return basicGetRTO();
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__ACTUAL_MW:
				return getActualMW();
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
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__MIN_MW:
				setMinMW((Float)newValue);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__MAX_MW:
				setMaxMW((Float)newValue);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO:
				setRTO((RTO)newValue);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__ACTUAL_MW:
				setActualMW((Float)newValue);
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
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__MIN_MW:
				setMinMW(MIN_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__MAX_MW:
				setMaxMW(MAX_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO:
				setRTO((RTO)null);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__ACTUAL_MW:
				setActualMW(ACTUAL_MW_EDEFAULT);
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
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__MIN_MW:
				return minMW != MIN_MW_EDEFAULT;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__MAX_MW:
				return maxMW != MAX_MW_EDEFAULT;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__RTO:
				return rto != null;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS__ACTUAL_MW:
				return actualMW != ACTUAL_MW_EDEFAULT;
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
		result.append(" (minMW: ");
		result.append(minMW);
		result.append(", maxMW: ");
		result.append(maxMW);
		result.append(", actualMW: ");
		result.append(actualMW);
		result.append(')');
		return result.toString();
	}

} //SecurityConstraintsImpl
