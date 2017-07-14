/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ancillary Service Clearing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.AncillaryServiceClearingImpl#getMcp <em>Mcp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.AncillaryServiceClearingImpl#getClearedMW <em>Cleared MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.AncillaryServiceClearingImpl#getMarketCaseClearing <em>Market Case Clearing</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.AncillaryServiceClearingImpl#getCommodityType <em>Commodity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AncillaryServiceClearingImpl extends MarketFactorsImpl implements AncillaryServiceClearing {
	/**
	 * The default value of the '{@link #getMcp() <em>Mcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcp()
	 * @generated
	 * @ordered
	 */
	protected static final float MCP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMcp() <em>Mcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcp()
	 * @generated
	 * @ordered
	 */
	protected float mcp = MCP_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearedMW() <em>Cleared MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearedMW()
	 * @generated
	 * @ordered
	 */
	protected static final float CLEARED_MW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClearedMW() <em>Cleared MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearedMW()
	 * @generated
	 * @ordered
	 */
	protected float clearedMW = CLEARED_MW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarketCaseClearing() <em>Market Case Clearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketCaseClearing()
	 * @generated
	 * @ordered
	 */
	protected MarketCaseClearing marketCaseClearing;

	/**
	 * The default value of the '{@link #getCommodityType() <em>Commodity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommodityType()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMODITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommodityType() <em>Commodity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommodityType()
	 * @generated
	 * @ordered
	 */
	protected String commodityType = COMMODITY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AncillaryServiceClearingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.ANCILLARY_SERVICE_CLEARING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMcp() {
		return mcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMcp(float newMcp) {
		float oldMcp = mcp;
		mcp = newMcp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MCP, oldMcp, mcp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getClearedMW() {
		return clearedMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearedMW(float newClearedMW) {
		float oldClearedMW = clearedMW;
		clearedMW = newClearedMW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__CLEARED_MW, oldClearedMW, clearedMW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketCaseClearing getMarketCaseClearing() {
		if (marketCaseClearing != null && marketCaseClearing.eIsProxy()) {
			InternalEObject oldMarketCaseClearing = (InternalEObject)marketCaseClearing;
			marketCaseClearing = (MarketCaseClearing)eResolveProxy(oldMarketCaseClearing);
			if (marketCaseClearing != oldMarketCaseClearing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING, oldMarketCaseClearing, marketCaseClearing));
			}
		}
		return marketCaseClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketCaseClearing basicGetMarketCaseClearing() {
		return marketCaseClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketCaseClearing(MarketCaseClearing newMarketCaseClearing, NotificationChain msgs) {
		MarketCaseClearing oldMarketCaseClearing = marketCaseClearing;
		marketCaseClearing = newMarketCaseClearing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING, oldMarketCaseClearing, newMarketCaseClearing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketCaseClearing(MarketCaseClearing newMarketCaseClearing) {
		if (newMarketCaseClearing != marketCaseClearing) {
			NotificationChain msgs = null;
			if (marketCaseClearing != null)
				msgs = ((InternalEObject)marketCaseClearing).eInverseRemove(this, MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING, MarketCaseClearing.class, msgs);
			if (newMarketCaseClearing != null)
				msgs = ((InternalEObject)newMarketCaseClearing).eInverseAdd(this, MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING, MarketCaseClearing.class, msgs);
			msgs = basicSetMarketCaseClearing(newMarketCaseClearing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING, newMarketCaseClearing, newMarketCaseClearing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommodityType() {
		return commodityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommodityType(String newCommodityType) {
		String oldCommodityType = commodityType;
		commodityType = newCommodityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__COMMODITY_TYPE, oldCommodityType, commodityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING:
				if (marketCaseClearing != null)
					msgs = ((InternalEObject)marketCaseClearing).eInverseRemove(this, MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING, MarketCaseClearing.class, msgs);
				return basicSetMarketCaseClearing((MarketCaseClearing)otherEnd, msgs);
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
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING:
				return basicSetMarketCaseClearing(null, msgs);
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
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MCP:
				return getMcp();
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__CLEARED_MW:
				return getClearedMW();
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING:
				if (resolve) return getMarketCaseClearing();
				return basicGetMarketCaseClearing();
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__COMMODITY_TYPE:
				return getCommodityType();
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
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MCP:
				setMcp((Float)newValue);
				return;
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__CLEARED_MW:
				setClearedMW((Float)newValue);
				return;
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING:
				setMarketCaseClearing((MarketCaseClearing)newValue);
				return;
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__COMMODITY_TYPE:
				setCommodityType((String)newValue);
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
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MCP:
				setMcp(MCP_EDEFAULT);
				return;
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__CLEARED_MW:
				setClearedMW(CLEARED_MW_EDEFAULT);
				return;
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING:
				setMarketCaseClearing((MarketCaseClearing)null);
				return;
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__COMMODITY_TYPE:
				setCommodityType(COMMODITY_TYPE_EDEFAULT);
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
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MCP:
				return mcp != MCP_EDEFAULT;
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__CLEARED_MW:
				return clearedMW != CLEARED_MW_EDEFAULT;
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING:
				return marketCaseClearing != null;
			case MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__COMMODITY_TYPE:
				return COMMODITY_TYPE_EDEFAULT == null ? commodityType != null : !COMMODITY_TYPE_EDEFAULT.equals(commodityType);
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
		result.append(" (mcp: ");
		result.append(mcp);
		result.append(", clearedMW: ");
		result.append(clearedMW);
		result.append(", commodityType: ");
		result.append(commodityType);
		result.append(')');
		return result.toString();
	}

} //AncillaryServiceClearingImpl
