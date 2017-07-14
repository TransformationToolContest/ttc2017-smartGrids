/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Market;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Market Factors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketFactorsImpl#getErpInvoices <em>Erp Invoices</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketFactorsImpl#getMarket <em>Market</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketFactorsImpl#getIntervalStartTime <em>Interval Start Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketFactorsImpl extends DocumentImpl implements MarketFactors {
	/**
	 * The cached value of the '{@link #getErpInvoices() <em>Erp Invoices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoices()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> erpInvoices;

	/**
	 * The cached value of the '{@link #getMarket() <em>Market</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarket()
	 * @generated
	 * @ordered
	 */
	protected Market market;

	/**
	 * The default value of the '{@link #getIntervalStartTime() <em>Interval Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date INTERVAL_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntervalStartTime() <em>Interval Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date intervalStartTime = INTERVAL_START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketFactorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.MARKET_FACTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoices() {
		if (erpInvoices == null) {
			erpInvoices = new EObjectWithInverseResolvingEList.ManyInverse<ErpInvoiceLineItem>(ErpInvoiceLineItem.class, this, MarketOperationsPackage.MARKET_FACTORS__ERP_INVOICES, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__MARKET_FACTORS);
		}
		return erpInvoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Market getMarket() {
		if (market != null && market.eIsProxy()) {
			InternalEObject oldMarket = (InternalEObject)market;
			market = (Market)eResolveProxy(oldMarket);
			if (market != oldMarket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.MARKET_FACTORS__MARKET, oldMarket, market));
			}
		}
		return market;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Market basicGetMarket() {
		return market;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarket(Market newMarket, NotificationChain msgs) {
		Market oldMarket = market;
		market = newMarket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_FACTORS__MARKET, oldMarket, newMarket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarket(Market newMarket) {
		if (newMarket != market) {
			NotificationChain msgs = null;
			if (market != null)
				msgs = ((InternalEObject)market).eInverseRemove(this, MarketOperationsPackage.MARKET__MARKET_FACTORS, Market.class, msgs);
			if (newMarket != null)
				msgs = ((InternalEObject)newMarket).eInverseAdd(this, MarketOperationsPackage.MARKET__MARKET_FACTORS, Market.class, msgs);
			msgs = basicSetMarket(newMarket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_FACTORS__MARKET, newMarket, newMarket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getIntervalStartTime() {
		return intervalStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalStartTime(Date newIntervalStartTime) {
		Date oldIntervalStartTime = intervalStartTime;
		intervalStartTime = newIntervalStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_FACTORS__INTERVAL_START_TIME, oldIntervalStartTime, intervalStartTime));
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
			case MarketOperationsPackage.MARKET_FACTORS__ERP_INVOICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoices()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_FACTORS__MARKET:
				if (market != null)
					msgs = ((InternalEObject)market).eInverseRemove(this, MarketOperationsPackage.MARKET__MARKET_FACTORS, Market.class, msgs);
				return basicSetMarket((Market)otherEnd, msgs);
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
			case MarketOperationsPackage.MARKET_FACTORS__ERP_INVOICES:
				return ((InternalEList<?>)getErpInvoices()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_FACTORS__MARKET:
				return basicSetMarket(null, msgs);
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
			case MarketOperationsPackage.MARKET_FACTORS__ERP_INVOICES:
				return getErpInvoices();
			case MarketOperationsPackage.MARKET_FACTORS__MARKET:
				if (resolve) return getMarket();
				return basicGetMarket();
			case MarketOperationsPackage.MARKET_FACTORS__INTERVAL_START_TIME:
				return getIntervalStartTime();
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
			case MarketOperationsPackage.MARKET_FACTORS__ERP_INVOICES:
				getErpInvoices().clear();
				getErpInvoices().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case MarketOperationsPackage.MARKET_FACTORS__MARKET:
				setMarket((Market)newValue);
				return;
			case MarketOperationsPackage.MARKET_FACTORS__INTERVAL_START_TIME:
				setIntervalStartTime((Date)newValue);
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
			case MarketOperationsPackage.MARKET_FACTORS__ERP_INVOICES:
				getErpInvoices().clear();
				return;
			case MarketOperationsPackage.MARKET_FACTORS__MARKET:
				setMarket((Market)null);
				return;
			case MarketOperationsPackage.MARKET_FACTORS__INTERVAL_START_TIME:
				setIntervalStartTime(INTERVAL_START_TIME_EDEFAULT);
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
			case MarketOperationsPackage.MARKET_FACTORS__ERP_INVOICES:
				return erpInvoices != null && !erpInvoices.isEmpty();
			case MarketOperationsPackage.MARKET_FACTORS__MARKET:
				return market != null;
			case MarketOperationsPackage.MARKET_FACTORS__INTERVAL_START_TIME:
				return INTERVAL_START_TIME_EDEFAULT == null ? intervalStartTime != null : !INTERVAL_START_TIME_EDEFAULT.equals(intervalStartTime);
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
		result.append(" (intervalStartTime: ");
		result.append(intervalStartTime);
		result.append(')');
		return result.toString();
	}

} //MarketFactorsImpl
