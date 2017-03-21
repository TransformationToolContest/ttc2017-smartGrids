/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.MarketProduct;
import CIM.IEC61970.Informative.MarketOperations.ReserveReq;
import CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve;
import CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserve Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqImpl#getSensitivityPriceCurve <em>Sensitivity Price Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqImpl#getReserveReqCurve <em>Reserve Req Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqImpl#getMarketProduct <em>Market Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReserveReqImpl extends ResourceGroupReqImpl implements ReserveReq {
	/**
	 * The cached value of the '{@link #getSensitivityPriceCurve() <em>Sensitivity Price Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivityPriceCurve()
	 * @generated
	 * @ordered
	 */
	protected SensitivityPriceCurve sensitivityPriceCurve;

	/**
	 * The cached value of the '{@link #getReserveReqCurve() <em>Reserve Req Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveReqCurve()
	 * @generated
	 * @ordered
	 */
	protected ReserveReqCurve reserveReqCurve;

	/**
	 * The cached value of the '{@link #getMarketProduct() <em>Market Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketProduct()
	 * @generated
	 * @ordered
	 */
	protected MarketProduct marketProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReserveReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.RESERVE_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitivityPriceCurve getSensitivityPriceCurve() {
		if (sensitivityPriceCurve != null && sensitivityPriceCurve.eIsProxy()) {
			InternalEObject oldSensitivityPriceCurve = (InternalEObject)sensitivityPriceCurve;
			sensitivityPriceCurve = (SensitivityPriceCurve)eResolveProxy(oldSensitivityPriceCurve);
			if (sensitivityPriceCurve != oldSensitivityPriceCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.RESERVE_REQ__SENSITIVITY_PRICE_CURVE, oldSensitivityPriceCurve, sensitivityPriceCurve));
			}
		}
		return sensitivityPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitivityPriceCurve basicGetSensitivityPriceCurve() {
		return sensitivityPriceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensitivityPriceCurve(SensitivityPriceCurve newSensitivityPriceCurve, NotificationChain msgs) {
		SensitivityPriceCurve oldSensitivityPriceCurve = sensitivityPriceCurve;
		sensitivityPriceCurve = newSensitivityPriceCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESERVE_REQ__SENSITIVITY_PRICE_CURVE, oldSensitivityPriceCurve, newSensitivityPriceCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensitivityPriceCurve(SensitivityPriceCurve newSensitivityPriceCurve) {
		if (newSensitivityPriceCurve != sensitivityPriceCurve) {
			NotificationChain msgs = null;
			if (sensitivityPriceCurve != null)
				msgs = ((InternalEObject)sensitivityPriceCurve).eInverseRemove(this, MarketOperationsPackage.SENSITIVITY_PRICE_CURVE__RESERVE_REQ, SensitivityPriceCurve.class, msgs);
			if (newSensitivityPriceCurve != null)
				msgs = ((InternalEObject)newSensitivityPriceCurve).eInverseAdd(this, MarketOperationsPackage.SENSITIVITY_PRICE_CURVE__RESERVE_REQ, SensitivityPriceCurve.class, msgs);
			msgs = basicSetSensitivityPriceCurve(newSensitivityPriceCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESERVE_REQ__SENSITIVITY_PRICE_CURVE, newSensitivityPriceCurve, newSensitivityPriceCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveReqCurve getReserveReqCurve() {
		if (reserveReqCurve != null && reserveReqCurve.eIsProxy()) {
			InternalEObject oldReserveReqCurve = (InternalEObject)reserveReqCurve;
			reserveReqCurve = (ReserveReqCurve)eResolveProxy(oldReserveReqCurve);
			if (reserveReqCurve != oldReserveReqCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE, oldReserveReqCurve, reserveReqCurve));
			}
		}
		return reserveReqCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveReqCurve basicGetReserveReqCurve() {
		return reserveReqCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserveReqCurve(ReserveReqCurve newReserveReqCurve, NotificationChain msgs) {
		ReserveReqCurve oldReserveReqCurve = reserveReqCurve;
		reserveReqCurve = newReserveReqCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE, oldReserveReqCurve, newReserveReqCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserveReqCurve(ReserveReqCurve newReserveReqCurve) {
		if (newReserveReqCurve != reserveReqCurve) {
			NotificationChain msgs = null;
			if (reserveReqCurve != null)
				msgs = ((InternalEObject)reserveReqCurve).eInverseRemove(this, MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ, ReserveReqCurve.class, msgs);
			if (newReserveReqCurve != null)
				msgs = ((InternalEObject)newReserveReqCurve).eInverseAdd(this, MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ, ReserveReqCurve.class, msgs);
			msgs = basicSetReserveReqCurve(newReserveReqCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE, newReserveReqCurve, newReserveReqCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketProduct getMarketProduct() {
		if (marketProduct != null && marketProduct.eIsProxy()) {
			InternalEObject oldMarketProduct = (InternalEObject)marketProduct;
			marketProduct = (MarketProduct)eResolveProxy(oldMarketProduct);
			if (marketProduct != oldMarketProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT, oldMarketProduct, marketProduct));
			}
		}
		return marketProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketProduct basicGetMarketProduct() {
		return marketProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketProduct(MarketProduct newMarketProduct, NotificationChain msgs) {
		MarketProduct oldMarketProduct = marketProduct;
		marketProduct = newMarketProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT, oldMarketProduct, newMarketProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketProduct(MarketProduct newMarketProduct) {
		if (newMarketProduct != marketProduct) {
			NotificationChain msgs = null;
			if (marketProduct != null)
				msgs = ((InternalEObject)marketProduct).eInverseRemove(this, MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS, MarketProduct.class, msgs);
			if (newMarketProduct != null)
				msgs = ((InternalEObject)newMarketProduct).eInverseAdd(this, MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS, MarketProduct.class, msgs);
			msgs = basicSetMarketProduct(newMarketProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT, newMarketProduct, newMarketProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.RESERVE_REQ__SENSITIVITY_PRICE_CURVE:
				if (sensitivityPriceCurve != null)
					msgs = ((InternalEObject)sensitivityPriceCurve).eInverseRemove(this, MarketOperationsPackage.SENSITIVITY_PRICE_CURVE__RESERVE_REQ, SensitivityPriceCurve.class, msgs);
				return basicSetSensitivityPriceCurve((SensitivityPriceCurve)otherEnd, msgs);
			case MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE:
				if (reserveReqCurve != null)
					msgs = ((InternalEObject)reserveReqCurve).eInverseRemove(this, MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ, ReserveReqCurve.class, msgs);
				return basicSetReserveReqCurve((ReserveReqCurve)otherEnd, msgs);
			case MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT:
				if (marketProduct != null)
					msgs = ((InternalEObject)marketProduct).eInverseRemove(this, MarketOperationsPackage.MARKET_PRODUCT__RESERVE_REQS, MarketProduct.class, msgs);
				return basicSetMarketProduct((MarketProduct)otherEnd, msgs);
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
			case MarketOperationsPackage.RESERVE_REQ__SENSITIVITY_PRICE_CURVE:
				return basicSetSensitivityPriceCurve(null, msgs);
			case MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE:
				return basicSetReserveReqCurve(null, msgs);
			case MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT:
				return basicSetMarketProduct(null, msgs);
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
			case MarketOperationsPackage.RESERVE_REQ__SENSITIVITY_PRICE_CURVE:
				if (resolve) return getSensitivityPriceCurve();
				return basicGetSensitivityPriceCurve();
			case MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE:
				if (resolve) return getReserveReqCurve();
				return basicGetReserveReqCurve();
			case MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT:
				if (resolve) return getMarketProduct();
				return basicGetMarketProduct();
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
			case MarketOperationsPackage.RESERVE_REQ__SENSITIVITY_PRICE_CURVE:
				setSensitivityPriceCurve((SensitivityPriceCurve)newValue);
				return;
			case MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE:
				setReserveReqCurve((ReserveReqCurve)newValue);
				return;
			case MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT:
				setMarketProduct((MarketProduct)newValue);
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
			case MarketOperationsPackage.RESERVE_REQ__SENSITIVITY_PRICE_CURVE:
				setSensitivityPriceCurve((SensitivityPriceCurve)null);
				return;
			case MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE:
				setReserveReqCurve((ReserveReqCurve)null);
				return;
			case MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT:
				setMarketProduct((MarketProduct)null);
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
			case MarketOperationsPackage.RESERVE_REQ__SENSITIVITY_PRICE_CURVE:
				return sensitivityPriceCurve != null;
			case MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE:
				return reserveReqCurve != null;
			case MarketOperationsPackage.RESERVE_REQ__MARKET_PRODUCT:
				return marketProduct != null;
		}
		return super.eIsSet(featureID);
	}

} //ReserveReqImpl
