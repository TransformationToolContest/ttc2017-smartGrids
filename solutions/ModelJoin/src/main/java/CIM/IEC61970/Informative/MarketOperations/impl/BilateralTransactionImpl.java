/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Informative.MarketOperations.BilateralTransaction;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bilateral Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl#getPurchaseTimeMax <em>Purchase Time Max</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl#getPurchaseTimeMin <em>Purchase Time Min</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl#getCurtailTimeMax <em>Curtail Time Max</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl#getCurtailTimeMin <em>Curtail Time Min</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl#getTotalTranChargeMax <em>Total Tran Charge Max</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl#getMarketType <em>Market Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.BilateralTransactionImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BilateralTransactionImpl extends ElementImpl implements BilateralTransaction {
	/**
	 * The default value of the '{@link #getPurchaseTimeMax() <em>Purchase Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseTimeMax()
	 * @generated
	 * @ordered
	 */
	protected static final int PURCHASE_TIME_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPurchaseTimeMax() <em>Purchase Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseTimeMax()
	 * @generated
	 * @ordered
	 */
	protected int purchaseTimeMax = PURCHASE_TIME_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchaseTimeMin() <em>Purchase Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseTimeMin()
	 * @generated
	 * @ordered
	 */
	protected static final int PURCHASE_TIME_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPurchaseTimeMin() <em>Purchase Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseTimeMin()
	 * @generated
	 * @ordered
	 */
	protected int purchaseTimeMin = PURCHASE_TIME_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurtailTimeMax() <em>Curtail Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtailTimeMax()
	 * @generated
	 * @ordered
	 */
	protected static final int CURTAIL_TIME_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurtailTimeMax() <em>Curtail Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtailTimeMax()
	 * @generated
	 * @ordered
	 */
	protected int curtailTimeMax = CURTAIL_TIME_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurtailTimeMin() <em>Curtail Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtailTimeMin()
	 * @generated
	 * @ordered
	 */
	protected static final int CURTAIL_TIME_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurtailTimeMin() <em>Curtail Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtailTimeMin()
	 * @generated
	 * @ordered
	 */
	protected int curtailTimeMin = CURTAIL_TIME_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalTranChargeMax() <em>Total Tran Charge Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTranChargeMax()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_TRAN_CHARGE_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalTranChargeMax() <em>Total Tran Charge Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTranChargeMax()
	 * @generated
	 * @ordered
	 */
	protected float totalTranChargeMax = TOTAL_TRAN_CHARGE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected String transactionType = TRANSACTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarketType() <em>Market Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketType()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarketType() <em>Market Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketType()
	 * @generated
	 * @ordered
	 */
	protected String marketType = MARKET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BilateralTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.BILATERAL_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPurchaseTimeMax() {
		return purchaseTimeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurchaseTimeMax(int newPurchaseTimeMax) {
		int oldPurchaseTimeMax = purchaseTimeMax;
		purchaseTimeMax = newPurchaseTimeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MAX, oldPurchaseTimeMax, purchaseTimeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPurchaseTimeMin() {
		return purchaseTimeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurchaseTimeMin(int newPurchaseTimeMin) {
		int oldPurchaseTimeMin = purchaseTimeMin;
		purchaseTimeMin = newPurchaseTimeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MIN, oldPurchaseTimeMin, purchaseTimeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurtailTimeMax() {
		return curtailTimeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurtailTimeMax(int newCurtailTimeMax) {
		int oldCurtailTimeMax = curtailTimeMax;
		curtailTimeMax = newCurtailTimeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MAX, oldCurtailTimeMax, curtailTimeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurtailTimeMin() {
		return curtailTimeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurtailTimeMin(int newCurtailTimeMin) {
		int oldCurtailTimeMin = curtailTimeMin;
		curtailTimeMin = newCurtailTimeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MIN, oldCurtailTimeMin, curtailTimeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalTranChargeMax() {
		return totalTranChargeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalTranChargeMax(float newTotalTranChargeMax) {
		float oldTotalTranChargeMax = totalTranChargeMax;
		totalTranChargeMax = newTotalTranChargeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILATERAL_TRANSACTION__TOTAL_TRAN_CHARGE_MAX, oldTotalTranChargeMax, totalTranChargeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(String newTransactionType) {
		String oldTransactionType = transactionType;
		transactionType = newTransactionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILATERAL_TRANSACTION__TRANSACTION_TYPE, oldTransactionType, transactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarketType() {
		return marketType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketType(String newMarketType) {
		String oldMarketType = marketType;
		marketType = newMarketType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILATERAL_TRANSACTION__MARKET_TYPE, oldMarketType, marketType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILATERAL_TRANSACTION__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MAX:
				return getPurchaseTimeMax();
			case MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MIN:
				return getPurchaseTimeMin();
			case MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MAX:
				return getCurtailTimeMax();
			case MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MIN:
				return getCurtailTimeMin();
			case MarketOperationsPackage.BILATERAL_TRANSACTION__TOTAL_TRAN_CHARGE_MAX:
				return getTotalTranChargeMax();
			case MarketOperationsPackage.BILATERAL_TRANSACTION__TRANSACTION_TYPE:
				return getTransactionType();
			case MarketOperationsPackage.BILATERAL_TRANSACTION__MARKET_TYPE:
				return getMarketType();
			case MarketOperationsPackage.BILATERAL_TRANSACTION__SCOPE:
				return getScope();
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
			case MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MAX:
				setPurchaseTimeMax((Integer)newValue);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MIN:
				setPurchaseTimeMin((Integer)newValue);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MAX:
				setCurtailTimeMax((Integer)newValue);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MIN:
				setCurtailTimeMin((Integer)newValue);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__TOTAL_TRAN_CHARGE_MAX:
				setTotalTranChargeMax((Float)newValue);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__TRANSACTION_TYPE:
				setTransactionType((String)newValue);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__MARKET_TYPE:
				setMarketType((String)newValue);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__SCOPE:
				setScope((String)newValue);
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
			case MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MAX:
				setPurchaseTimeMax(PURCHASE_TIME_MAX_EDEFAULT);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MIN:
				setPurchaseTimeMin(PURCHASE_TIME_MIN_EDEFAULT);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MAX:
				setCurtailTimeMax(CURTAIL_TIME_MAX_EDEFAULT);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MIN:
				setCurtailTimeMin(CURTAIL_TIME_MIN_EDEFAULT);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__TOTAL_TRAN_CHARGE_MAX:
				setTotalTranChargeMax(TOTAL_TRAN_CHARGE_MAX_EDEFAULT);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__TRANSACTION_TYPE:
				setTransactionType(TRANSACTION_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__MARKET_TYPE:
				setMarketType(MARKET_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__SCOPE:
				setScope(SCOPE_EDEFAULT);
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
			case MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MAX:
				return purchaseTimeMax != PURCHASE_TIME_MAX_EDEFAULT;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__PURCHASE_TIME_MIN:
				return purchaseTimeMin != PURCHASE_TIME_MIN_EDEFAULT;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MAX:
				return curtailTimeMax != CURTAIL_TIME_MAX_EDEFAULT;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__CURTAIL_TIME_MIN:
				return curtailTimeMin != CURTAIL_TIME_MIN_EDEFAULT;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__TOTAL_TRAN_CHARGE_MAX:
				return totalTranChargeMax != TOTAL_TRAN_CHARGE_MAX_EDEFAULT;
			case MarketOperationsPackage.BILATERAL_TRANSACTION__TRANSACTION_TYPE:
				return TRANSACTION_TYPE_EDEFAULT == null ? transactionType != null : !TRANSACTION_TYPE_EDEFAULT.equals(transactionType);
			case MarketOperationsPackage.BILATERAL_TRANSACTION__MARKET_TYPE:
				return MARKET_TYPE_EDEFAULT == null ? marketType != null : !MARKET_TYPE_EDEFAULT.equals(marketType);
			case MarketOperationsPackage.BILATERAL_TRANSACTION__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
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
		result.append(" (purchaseTimeMax: ");
		result.append(purchaseTimeMax);
		result.append(", purchaseTimeMin: ");
		result.append(purchaseTimeMin);
		result.append(", curtailTimeMax: ");
		result.append(curtailTimeMax);
		result.append(", curtailTimeMin: ");
		result.append(curtailTimeMin);
		result.append(", totalTranChargeMax: ");
		result.append(totalTranChargeMax);
		result.append(", transactionType: ");
		result.append(transactionType);
		result.append(", marketType: ");
		result.append(marketType);
		result.append(", scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //BilateralTransactionImpl
