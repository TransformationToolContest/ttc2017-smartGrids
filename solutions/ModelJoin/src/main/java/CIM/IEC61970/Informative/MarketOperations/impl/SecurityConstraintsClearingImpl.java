/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Constraints Clearing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsClearingImpl#getMwLimit <em>Mw Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsClearingImpl#getMwFlow <em>Mw Flow</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.SecurityConstraintsClearingImpl#getShadowPrice <em>Shadow Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityConstraintsClearingImpl extends MarketFactorsImpl implements SecurityConstraintsClearing {
	/**
	 * The default value of the '{@link #getMwLimit() <em>Mw Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMwLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float MW_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMwLimit() <em>Mw Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMwLimit()
	 * @generated
	 * @ordered
	 */
	protected float mwLimit = MW_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMwFlow() <em>Mw Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMwFlow()
	 * @generated
	 * @ordered
	 */
	protected static final float MW_FLOW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMwFlow() <em>Mw Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMwFlow()
	 * @generated
	 * @ordered
	 */
	protected float mwFlow = MW_FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadowPrice() <em>Shadow Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float SHADOW_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShadowPrice() <em>Shadow Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowPrice()
	 * @generated
	 * @ordered
	 */
	protected float shadowPrice = SHADOW_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityConstraintsClearingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.SECURITY_CONSTRAINTS_CLEARING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMwLimit() {
		return mwLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMwLimit(float newMwLimit) {
		float oldMwLimit = mwLimit;
		mwLimit = newMwLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_LIMIT, oldMwLimit, mwLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMwFlow() {
		return mwFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMwFlow(float newMwFlow) {
		float oldMwFlow = mwFlow;
		mwFlow = newMwFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_FLOW, oldMwFlow, mwFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShadowPrice() {
		return shadowPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowPrice(float newShadowPrice) {
		float oldShadowPrice = shadowPrice;
		shadowPrice = newShadowPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__SHADOW_PRICE, oldShadowPrice, shadowPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_LIMIT:
				return getMwLimit();
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_FLOW:
				return getMwFlow();
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__SHADOW_PRICE:
				return getShadowPrice();
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
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_LIMIT:
				setMwLimit((Float)newValue);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_FLOW:
				setMwFlow((Float)newValue);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__SHADOW_PRICE:
				setShadowPrice((Float)newValue);
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
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_LIMIT:
				setMwLimit(MW_LIMIT_EDEFAULT);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_FLOW:
				setMwFlow(MW_FLOW_EDEFAULT);
				return;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__SHADOW_PRICE:
				setShadowPrice(SHADOW_PRICE_EDEFAULT);
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
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_LIMIT:
				return mwLimit != MW_LIMIT_EDEFAULT;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__MW_FLOW:
				return mwFlow != MW_FLOW_EDEFAULT;
			case MarketOperationsPackage.SECURITY_CONSTRAINTS_CLEARING__SHADOW_PRICE:
				return shadowPrice != SHADOW_PRICE_EDEFAULT;
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
		result.append(" (mwLimit: ");
		result.append(mwLimit);
		result.append(", mwFlow: ");
		result.append(mwFlow);
		result.append(", shadowPrice: ");
		result.append(shadowPrice);
		result.append(')');
		return result.toString();
	}

} //SecurityConstraintsClearingImpl
