/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Market;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement;

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
 * An implementation of the model object '<em><b>Settlement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SettlementImpl#getMarket <em>Market</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SettlementImpl#getTradeDate <em>Trade Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SettlementImpl#getErpLedgerEntries <em>Erp Ledger Entries</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.SettlementImpl#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettlementImpl extends DocumentImpl implements Settlement {
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
	 * The default value of the '{@link #getTradeDate() <em>Trade Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRADE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTradeDate() <em>Trade Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeDate()
	 * @generated
	 * @ordered
	 */
	protected Date tradeDate = TRADE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpLedgerEntries() <em>Erp Ledger Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpLedgerEntry> erpLedgerEntries;

	/**
	 * The cached value of the '{@link #getErpInvoiceLineItems() <em>Erp Invoice Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> erpInvoiceLineItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettlementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.SETTLEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.SETTLEMENT__MARKET, oldMarket, market));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SETTLEMENT__MARKET, oldMarket, newMarket);
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
				msgs = ((InternalEObject)market).eInverseRemove(this, MarketOperationsPackage.MARKET__SETTLEMENTS, Market.class, msgs);
			if (newMarket != null)
				msgs = ((InternalEObject)newMarket).eInverseAdd(this, MarketOperationsPackage.MARKET__SETTLEMENTS, Market.class, msgs);
			msgs = basicSetMarket(newMarket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SETTLEMENT__MARKET, newMarket, newMarket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTradeDate() {
		return tradeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradeDate(Date newTradeDate) {
		Date oldTradeDate = tradeDate;
		tradeDate = newTradeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.SETTLEMENT__TRADE_DATE, oldTradeDate, tradeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpLedgerEntry> getErpLedgerEntries() {
		if (erpLedgerEntries == null) {
			erpLedgerEntries = new EObjectWithInverseResolvingEList.ManyInverse<ErpLedgerEntry>(ErpLedgerEntry.class, this, MarketOperationsPackage.SETTLEMENT__ERP_LEDGER_ENTRIES, InfERPSupportPackage.ERP_LEDGER_ENTRY__SETTLEMENTS);
		}
		return erpLedgerEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoiceLineItems() {
		if (erpInvoiceLineItems == null) {
			erpInvoiceLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpInvoiceLineItem>(ErpInvoiceLineItem.class, this, MarketOperationsPackage.SETTLEMENT__ERP_INVOICE_LINE_ITEMS, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__SETTLEMENTS);
		}
		return erpInvoiceLineItems;
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
			case MarketOperationsPackage.SETTLEMENT__MARKET:
				if (market != null)
					msgs = ((InternalEObject)market).eInverseRemove(this, MarketOperationsPackage.MARKET__SETTLEMENTS, Market.class, msgs);
				return basicSetMarket((Market)otherEnd, msgs);
			case MarketOperationsPackage.SETTLEMENT__ERP_LEDGER_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpLedgerEntries()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.SETTLEMENT__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.SETTLEMENT__MARKET:
				return basicSetMarket(null, msgs);
			case MarketOperationsPackage.SETTLEMENT__ERP_LEDGER_ENTRIES:
				return ((InternalEList<?>)getErpLedgerEntries()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.SETTLEMENT__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.SETTLEMENT__MARKET:
				if (resolve) return getMarket();
				return basicGetMarket();
			case MarketOperationsPackage.SETTLEMENT__TRADE_DATE:
				return getTradeDate();
			case MarketOperationsPackage.SETTLEMENT__ERP_LEDGER_ENTRIES:
				return getErpLedgerEntries();
			case MarketOperationsPackage.SETTLEMENT__ERP_INVOICE_LINE_ITEMS:
				return getErpInvoiceLineItems();
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
			case MarketOperationsPackage.SETTLEMENT__MARKET:
				setMarket((Market)newValue);
				return;
			case MarketOperationsPackage.SETTLEMENT__TRADE_DATE:
				setTradeDate((Date)newValue);
				return;
			case MarketOperationsPackage.SETTLEMENT__ERP_LEDGER_ENTRIES:
				getErpLedgerEntries().clear();
				getErpLedgerEntries().addAll((Collection<? extends ErpLedgerEntry>)newValue);
				return;
			case MarketOperationsPackage.SETTLEMENT__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				getErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
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
			case MarketOperationsPackage.SETTLEMENT__MARKET:
				setMarket((Market)null);
				return;
			case MarketOperationsPackage.SETTLEMENT__TRADE_DATE:
				setTradeDate(TRADE_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.SETTLEMENT__ERP_LEDGER_ENTRIES:
				getErpLedgerEntries().clear();
				return;
			case MarketOperationsPackage.SETTLEMENT__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
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
			case MarketOperationsPackage.SETTLEMENT__MARKET:
				return market != null;
			case MarketOperationsPackage.SETTLEMENT__TRADE_DATE:
				return TRADE_DATE_EDEFAULT == null ? tradeDate != null : !TRADE_DATE_EDEFAULT.equals(tradeDate);
			case MarketOperationsPackage.SETTLEMENT__ERP_LEDGER_ENTRIES:
				return erpLedgerEntries != null && !erpLedgerEntries.isEmpty();
			case MarketOperationsPackage.SETTLEMENT__ERP_INVOICE_LINE_ITEMS:
				return erpInvoiceLineItems != null && !erpInvoiceLineItems.isEmpty();
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
		result.append(" (tradeDate: ");
		result.append(tradeDate);
		result.append(')');
		return result.toString();
	}

} //SettlementImpl
