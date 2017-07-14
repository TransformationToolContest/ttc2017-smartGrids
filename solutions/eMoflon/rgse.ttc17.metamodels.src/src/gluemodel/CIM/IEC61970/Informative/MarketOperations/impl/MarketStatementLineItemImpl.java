/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill;

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
 * An implementation of the model object '<em><b>Market Statement Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getCurrentAmount <em>Current Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getPreviousISOAmount <em>Previous ISO Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getQuantityUOM <em>Quantity UOM</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getNetISOAmount <em>Net ISO Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getCurrentISOAmount <em>Current ISO Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getPreviousQuantity <em>Previous Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getComponentMarketStatementLineItem <em>Component Market Statement Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getPreviousAmount <em>Previous Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getNetISOQuantity <em>Net ISO Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getNetPrice <em>Net Price</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getCurrentISOQuantity <em>Current ISO Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getCurrentPrice <em>Current Price</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getPassThroughBill <em>Pass Through Bill</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getPrevisouPrice <em>Previsou Price</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getMarketStatement <em>Market Statement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getPreviousISOQuantity <em>Previous ISO Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getIntervalDate <em>Interval Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getNetQuantity <em>Net Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getNetAmount <em>Net Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getCurrentQuantity <em>Current Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getIntervalNumber <em>Interval Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementLineItemImpl#getContainerMarketStatementLineItem <em>Container Market Statement Line Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketStatementLineItemImpl extends IdentifiedObjectImpl implements MarketStatementLineItem {
	/**
	 * The default value of the '{@link #getCurrentAmount() <em>Current Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentAmount() <em>Current Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAmount()
	 * @generated
	 * @ordered
	 */
	protected float currentAmount = CURRENT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousISOAmount() <em>Previous ISO Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousISOAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float PREVIOUS_ISO_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPreviousISOAmount() <em>Previous ISO Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousISOAmount()
	 * @generated
	 * @ordered
	 */
	protected float previousISOAmount = PREVIOUS_ISO_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityUOM() <em>Quantity UOM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUOM()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_UOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityUOM() <em>Quantity UOM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUOM()
	 * @generated
	 * @ordered
	 */
	protected String quantityUOM = QUANTITY_UOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetISOAmount() <em>Net ISO Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetISOAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float NET_ISO_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNetISOAmount() <em>Net ISO Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetISOAmount()
	 * @generated
	 * @ordered
	 */
	protected float netISOAmount = NET_ISO_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserAttributes() <em>User Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> userAttributes;

	/**
	 * The default value of the '{@link #getCurrentISOAmount() <em>Current ISO Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentISOAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_ISO_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentISOAmount() <em>Current ISO Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentISOAmount()
	 * @generated
	 * @ordered
	 */
	protected float currentISOAmount = CURRENT_ISO_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousQuantity() <em>Previous Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final float PREVIOUS_QUANTITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPreviousQuantity() <em>Previous Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousQuantity()
	 * @generated
	 * @ordered
	 */
	protected float previousQuantity = PREVIOUS_QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentMarketStatementLineItem() <em>Component Market Statement Line Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentMarketStatementLineItem()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketStatementLineItem> componentMarketStatementLineItem;

	/**
	 * The default value of the '{@link #getPreviousAmount() <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float PREVIOUS_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPreviousAmount() <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousAmount()
	 * @generated
	 * @ordered
	 */
	protected float previousAmount = PREVIOUS_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetISOQuantity() <em>Net ISO Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetISOQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final float NET_ISO_QUANTITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNetISOQuantity() <em>Net ISO Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetISOQuantity()
	 * @generated
	 * @ordered
	 */
	protected float netISOQuantity = NET_ISO_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetPrice() <em>Net Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float NET_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNetPrice() <em>Net Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetPrice()
	 * @generated
	 * @ordered
	 */
	protected float netPrice = NET_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentISOQuantity() <em>Current ISO Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentISOQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_ISO_QUANTITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentISOQuantity() <em>Current ISO Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentISOQuantity()
	 * @generated
	 * @ordered
	 */
	protected float currentISOQuantity = CURRENT_ISO_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentPrice() <em>Current Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentPrice() <em>Current Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPrice()
	 * @generated
	 * @ordered
	 */
	protected float currentPrice = CURRENT_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassThroughBill() <em>Pass Through Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassThroughBill()
	 * @generated
	 * @ordered
	 */
	protected PassThroughBill passThroughBill;

	/**
	 * The default value of the '{@link #getPrevisouPrice() <em>Previsou Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevisouPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PREVISOU_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrevisouPrice() <em>Previsou Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevisouPrice()
	 * @generated
	 * @ordered
	 */
	protected float previsouPrice = PREVISOU_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarketStatement() <em>Market Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketStatement()
	 * @generated
	 * @ordered
	 */
	protected MarketStatement marketStatement;

	/**
	 * The default value of the '{@link #getPreviousISOQuantity() <em>Previous ISO Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousISOQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final float PREVIOUS_ISO_QUANTITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPreviousISOQuantity() <em>Previous ISO Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousISOQuantity()
	 * @generated
	 * @ordered
	 */
	protected float previousISOQuantity = PREVIOUS_ISO_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalDate() <em>Interval Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date INTERVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntervalDate() <em>Interval Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalDate()
	 * @generated
	 * @ordered
	 */
	protected Date intervalDate = INTERVAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetQuantity() <em>Net Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final float NET_QUANTITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNetQuantity() <em>Net Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetQuantity()
	 * @generated
	 * @ordered
	 */
	protected float netQuantity = NET_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetAmount() <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float NET_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNetAmount() <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAmount()
	 * @generated
	 * @ordered
	 */
	protected float netAmount = NET_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentQuantity() <em>Current Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_QUANTITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentQuantity() <em>Current Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentQuantity()
	 * @generated
	 * @ordered
	 */
	protected float currentQuantity = CURRENT_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalNumber() <em>Interval Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntervalNumber() <em>Interval Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalNumber()
	 * @generated
	 * @ordered
	 */
	protected String intervalNumber = INTERVAL_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainerMarketStatementLineItem() <em>Container Market Statement Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerMarketStatementLineItem()
	 * @generated
	 * @ordered
	 */
	protected MarketStatementLineItem containerMarketStatementLineItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketStatementLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.MARKET_STATEMENT_LINE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentAmount() {
		return currentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentAmount(float newCurrentAmount) {
		float oldCurrentAmount = currentAmount;
		currentAmount = newCurrentAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_AMOUNT, oldCurrentAmount, currentAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPreviousISOAmount() {
		return previousISOAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousISOAmount(float newPreviousISOAmount) {
		float oldPreviousISOAmount = previousISOAmount;
		previousISOAmount = newPreviousISOAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_AMOUNT, oldPreviousISOAmount, previousISOAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuantityUOM() {
		return quantityUOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityUOM(String newQuantityUOM) {
		String oldQuantityUOM = quantityUOM;
		quantityUOM = newQuantityUOM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__QUANTITY_UOM, oldQuantityUOM, quantityUOM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNetISOAmount() {
		return netISOAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetISOAmount(float newNetISOAmount) {
		float oldNetISOAmount = netISOAmount;
		netISOAmount = newNetISOAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_AMOUNT, oldNetISOAmount, netISOAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getUserAttributes() {
		if (userAttributes == null) {
			userAttributes = new EObjectWithInverseResolvingEList.ManyInverse<UserAttribute>(UserAttribute.class, this, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES, CommonPackage.USER_ATTRIBUTE__ERP_STATEMENT_LINE_ITEMS);
		}
		return userAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentISOAmount() {
		return currentISOAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentISOAmount(float newCurrentISOAmount) {
		float oldCurrentISOAmount = currentISOAmount;
		currentISOAmount = newCurrentISOAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_AMOUNT, oldCurrentISOAmount, currentISOAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPreviousQuantity() {
		return previousQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousQuantity(float newPreviousQuantity) {
		float oldPreviousQuantity = previousQuantity;
		previousQuantity = newPreviousQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_QUANTITY, oldPreviousQuantity, previousQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketStatementLineItem> getComponentMarketStatementLineItem() {
		if (componentMarketStatementLineItem == null) {
			componentMarketStatementLineItem = new EObjectWithInverseResolvingEList<MarketStatementLineItem>(MarketStatementLineItem.class, this, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM);
		}
		return componentMarketStatementLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPreviousAmount() {
		return previousAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousAmount(float newPreviousAmount) {
		float oldPreviousAmount = previousAmount;
		previousAmount = newPreviousAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_AMOUNT, oldPreviousAmount, previousAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNetISOQuantity() {
		return netISOQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetISOQuantity(float newNetISOQuantity) {
		float oldNetISOQuantity = netISOQuantity;
		netISOQuantity = newNetISOQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_QUANTITY, oldNetISOQuantity, netISOQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNetPrice() {
		return netPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetPrice(float newNetPrice) {
		float oldNetPrice = netPrice;
		netPrice = newNetPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_PRICE, oldNetPrice, netPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentISOQuantity() {
		return currentISOQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentISOQuantity(float newCurrentISOQuantity) {
		float oldCurrentISOQuantity = currentISOQuantity;
		currentISOQuantity = newCurrentISOQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_QUANTITY, oldCurrentISOQuantity, currentISOQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentPrice() {
		return currentPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPrice(float newCurrentPrice) {
		float oldCurrentPrice = currentPrice;
		currentPrice = newCurrentPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_PRICE, oldCurrentPrice, currentPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassThroughBill getPassThroughBill() {
		if (passThroughBill != null && passThroughBill.eIsProxy()) {
			InternalEObject oldPassThroughBill = (InternalEObject)passThroughBill;
			passThroughBill = (PassThroughBill)eResolveProxy(oldPassThroughBill);
			if (passThroughBill != oldPassThroughBill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL, oldPassThroughBill, passThroughBill));
			}
		}
		return passThroughBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassThroughBill basicGetPassThroughBill() {
		return passThroughBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassThroughBill(PassThroughBill newPassThroughBill, NotificationChain msgs) {
		PassThroughBill oldPassThroughBill = passThroughBill;
		passThroughBill = newPassThroughBill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL, oldPassThroughBill, newPassThroughBill);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassThroughBill(PassThroughBill newPassThroughBill) {
		if (newPassThroughBill != passThroughBill) {
			NotificationChain msgs = null;
			if (passThroughBill != null)
				msgs = ((InternalEObject)passThroughBill).eInverseRemove(this, MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM, PassThroughBill.class, msgs);
			if (newPassThroughBill != null)
				msgs = ((InternalEObject)newPassThroughBill).eInverseAdd(this, MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM, PassThroughBill.class, msgs);
			msgs = basicSetPassThroughBill(newPassThroughBill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL, newPassThroughBill, newPassThroughBill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrevisouPrice() {
		return previsouPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevisouPrice(float newPrevisouPrice) {
		float oldPrevisouPrice = previsouPrice;
		previsouPrice = newPrevisouPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVISOU_PRICE, oldPrevisouPrice, previsouPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketStatement getMarketStatement() {
		if (marketStatement != null && marketStatement.eIsProxy()) {
			InternalEObject oldMarketStatement = (InternalEObject)marketStatement;
			marketStatement = (MarketStatement)eResolveProxy(oldMarketStatement);
			if (marketStatement != oldMarketStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT, oldMarketStatement, marketStatement));
			}
		}
		return marketStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketStatement basicGetMarketStatement() {
		return marketStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketStatement(MarketStatement newMarketStatement, NotificationChain msgs) {
		MarketStatement oldMarketStatement = marketStatement;
		marketStatement = newMarketStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT, oldMarketStatement, newMarketStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketStatement(MarketStatement newMarketStatement) {
		if (newMarketStatement != marketStatement) {
			NotificationChain msgs = null;
			if (marketStatement != null)
				msgs = ((InternalEObject)marketStatement).eInverseRemove(this, MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM, MarketStatement.class, msgs);
			if (newMarketStatement != null)
				msgs = ((InternalEObject)newMarketStatement).eInverseAdd(this, MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM, MarketStatement.class, msgs);
			msgs = basicSetMarketStatement(newMarketStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT, newMarketStatement, newMarketStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPreviousISOQuantity() {
		return previousISOQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousISOQuantity(float newPreviousISOQuantity) {
		float oldPreviousISOQuantity = previousISOQuantity;
		previousISOQuantity = newPreviousISOQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_QUANTITY, oldPreviousISOQuantity, previousISOQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getIntervalDate() {
		return intervalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalDate(Date newIntervalDate) {
		Date oldIntervalDate = intervalDate;
		intervalDate = newIntervalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_DATE, oldIntervalDate, intervalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNetQuantity() {
		return netQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetQuantity(float newNetQuantity) {
		float oldNetQuantity = netQuantity;
		netQuantity = newNetQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_QUANTITY, oldNetQuantity, netQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNetAmount() {
		return netAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetAmount(float newNetAmount) {
		float oldNetAmount = netAmount;
		netAmount = newNetAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_AMOUNT, oldNetAmount, netAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentQuantity() {
		return currentQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentQuantity(float newCurrentQuantity) {
		float oldCurrentQuantity = currentQuantity;
		currentQuantity = newCurrentQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_QUANTITY, oldCurrentQuantity, currentQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntervalNumber() {
		return intervalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalNumber(String newIntervalNumber) {
		String oldIntervalNumber = intervalNumber;
		intervalNumber = newIntervalNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_NUMBER, oldIntervalNumber, intervalNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketStatementLineItem getContainerMarketStatementLineItem() {
		if (containerMarketStatementLineItem != null && containerMarketStatementLineItem.eIsProxy()) {
			InternalEObject oldContainerMarketStatementLineItem = (InternalEObject)containerMarketStatementLineItem;
			containerMarketStatementLineItem = (MarketStatementLineItem)eResolveProxy(oldContainerMarketStatementLineItem);
			if (containerMarketStatementLineItem != oldContainerMarketStatementLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM, oldContainerMarketStatementLineItem, containerMarketStatementLineItem));
			}
		}
		return containerMarketStatementLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketStatementLineItem basicGetContainerMarketStatementLineItem() {
		return containerMarketStatementLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerMarketStatementLineItem(MarketStatementLineItem newContainerMarketStatementLineItem, NotificationChain msgs) {
		MarketStatementLineItem oldContainerMarketStatementLineItem = containerMarketStatementLineItem;
		containerMarketStatementLineItem = newContainerMarketStatementLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM, oldContainerMarketStatementLineItem, newContainerMarketStatementLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerMarketStatementLineItem(MarketStatementLineItem newContainerMarketStatementLineItem) {
		if (newContainerMarketStatementLineItem != containerMarketStatementLineItem) {
			NotificationChain msgs = null;
			if (containerMarketStatementLineItem != null)
				msgs = ((InternalEObject)containerMarketStatementLineItem).eInverseRemove(this, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM, MarketStatementLineItem.class, msgs);
			if (newContainerMarketStatementLineItem != null)
				msgs = ((InternalEObject)newContainerMarketStatementLineItem).eInverseAdd(this, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM, MarketStatementLineItem.class, msgs);
			msgs = basicSetContainerMarketStatementLineItem(newContainerMarketStatementLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM, newContainerMarketStatementLineItem, newContainerMarketStatementLineItem));
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
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserAttributes()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponentMarketStatementLineItem()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL:
				if (passThroughBill != null)
					msgs = ((InternalEObject)passThroughBill).eInverseRemove(this, MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM, PassThroughBill.class, msgs);
				return basicSetPassThroughBill((PassThroughBill)otherEnd, msgs);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT:
				if (marketStatement != null)
					msgs = ((InternalEObject)marketStatement).eInverseRemove(this, MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM, MarketStatement.class, msgs);
				return basicSetMarketStatement((MarketStatement)otherEnd, msgs);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM:
				if (containerMarketStatementLineItem != null)
					msgs = ((InternalEObject)containerMarketStatementLineItem).eInverseRemove(this, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM, MarketStatementLineItem.class, msgs);
				return basicSetContainerMarketStatementLineItem((MarketStatementLineItem)otherEnd, msgs);
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
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES:
				return ((InternalEList<?>)getUserAttributes()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM:
				return ((InternalEList<?>)getComponentMarketStatementLineItem()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL:
				return basicSetPassThroughBill(null, msgs);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT:
				return basicSetMarketStatement(null, msgs);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM:
				return basicSetContainerMarketStatementLineItem(null, msgs);
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
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_AMOUNT:
				return getCurrentAmount();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_AMOUNT:
				return getPreviousISOAmount();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__QUANTITY_UOM:
				return getQuantityUOM();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_AMOUNT:
				return getNetISOAmount();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES:
				return getUserAttributes();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_AMOUNT:
				return getCurrentISOAmount();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_QUANTITY:
				return getPreviousQuantity();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM:
				return getComponentMarketStatementLineItem();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_AMOUNT:
				return getPreviousAmount();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_QUANTITY:
				return getNetISOQuantity();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_PRICE:
				return getNetPrice();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_QUANTITY:
				return getCurrentISOQuantity();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_PRICE:
				return getCurrentPrice();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL:
				if (resolve) return getPassThroughBill();
				return basicGetPassThroughBill();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVISOU_PRICE:
				return getPrevisouPrice();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT:
				if (resolve) return getMarketStatement();
				return basicGetMarketStatement();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_QUANTITY:
				return getPreviousISOQuantity();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_DATE:
				return getIntervalDate();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_QUANTITY:
				return getNetQuantity();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_AMOUNT:
				return getNetAmount();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_QUANTITY:
				return getCurrentQuantity();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_NUMBER:
				return getIntervalNumber();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM:
				if (resolve) return getContainerMarketStatementLineItem();
				return basicGetContainerMarketStatementLineItem();
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
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_AMOUNT:
				setCurrentAmount((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_AMOUNT:
				setPreviousISOAmount((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__QUANTITY_UOM:
				setQuantityUOM((String)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_AMOUNT:
				setNetISOAmount((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES:
				getUserAttributes().clear();
				getUserAttributes().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_AMOUNT:
				setCurrentISOAmount((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_QUANTITY:
				setPreviousQuantity((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM:
				getComponentMarketStatementLineItem().clear();
				getComponentMarketStatementLineItem().addAll((Collection<? extends MarketStatementLineItem>)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_AMOUNT:
				setPreviousAmount((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_QUANTITY:
				setNetISOQuantity((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_PRICE:
				setNetPrice((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_QUANTITY:
				setCurrentISOQuantity((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_PRICE:
				setCurrentPrice((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL:
				setPassThroughBill((PassThroughBill)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVISOU_PRICE:
				setPrevisouPrice((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT:
				setMarketStatement((MarketStatement)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_QUANTITY:
				setPreviousISOQuantity((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_DATE:
				setIntervalDate((Date)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_QUANTITY:
				setNetQuantity((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_AMOUNT:
				setNetAmount((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_QUANTITY:
				setCurrentQuantity((Float)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_NUMBER:
				setIntervalNumber((String)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM:
				setContainerMarketStatementLineItem((MarketStatementLineItem)newValue);
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
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_AMOUNT:
				setCurrentAmount(CURRENT_AMOUNT_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_AMOUNT:
				setPreviousISOAmount(PREVIOUS_ISO_AMOUNT_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__QUANTITY_UOM:
				setQuantityUOM(QUANTITY_UOM_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_AMOUNT:
				setNetISOAmount(NET_ISO_AMOUNT_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES:
				getUserAttributes().clear();
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_AMOUNT:
				setCurrentISOAmount(CURRENT_ISO_AMOUNT_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_QUANTITY:
				setPreviousQuantity(PREVIOUS_QUANTITY_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM:
				getComponentMarketStatementLineItem().clear();
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_AMOUNT:
				setPreviousAmount(PREVIOUS_AMOUNT_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_QUANTITY:
				setNetISOQuantity(NET_ISO_QUANTITY_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_PRICE:
				setNetPrice(NET_PRICE_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_QUANTITY:
				setCurrentISOQuantity(CURRENT_ISO_QUANTITY_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_PRICE:
				setCurrentPrice(CURRENT_PRICE_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL:
				setPassThroughBill((PassThroughBill)null);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVISOU_PRICE:
				setPrevisouPrice(PREVISOU_PRICE_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT:
				setMarketStatement((MarketStatement)null);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_QUANTITY:
				setPreviousISOQuantity(PREVIOUS_ISO_QUANTITY_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_DATE:
				setIntervalDate(INTERVAL_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_QUANTITY:
				setNetQuantity(NET_QUANTITY_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_AMOUNT:
				setNetAmount(NET_AMOUNT_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_QUANTITY:
				setCurrentQuantity(CURRENT_QUANTITY_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_NUMBER:
				setIntervalNumber(INTERVAL_NUMBER_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM:
				setContainerMarketStatementLineItem((MarketStatementLineItem)null);
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
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_AMOUNT:
				return currentAmount != CURRENT_AMOUNT_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_AMOUNT:
				return previousISOAmount != PREVIOUS_ISO_AMOUNT_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__QUANTITY_UOM:
				return QUANTITY_UOM_EDEFAULT == null ? quantityUOM != null : !QUANTITY_UOM_EDEFAULT.equals(quantityUOM);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_AMOUNT:
				return netISOAmount != NET_ISO_AMOUNT_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__USER_ATTRIBUTES:
				return userAttributes != null && !userAttributes.isEmpty();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_AMOUNT:
				return currentISOAmount != CURRENT_ISO_AMOUNT_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_QUANTITY:
				return previousQuantity != PREVIOUS_QUANTITY_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__COMPONENT_MARKET_STATEMENT_LINE_ITEM:
				return componentMarketStatementLineItem != null && !componentMarketStatementLineItem.isEmpty();
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_AMOUNT:
				return previousAmount != PREVIOUS_AMOUNT_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_ISO_QUANTITY:
				return netISOQuantity != NET_ISO_QUANTITY_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_PRICE:
				return netPrice != NET_PRICE_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_ISO_QUANTITY:
				return currentISOQuantity != CURRENT_ISO_QUANTITY_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_PRICE:
				return currentPrice != CURRENT_PRICE_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL:
				return passThroughBill != null;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVISOU_PRICE:
				return previsouPrice != PREVISOU_PRICE_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT:
				return marketStatement != null;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PREVIOUS_ISO_QUANTITY:
				return previousISOQuantity != PREVIOUS_ISO_QUANTITY_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_DATE:
				return INTERVAL_DATE_EDEFAULT == null ? intervalDate != null : !INTERVAL_DATE_EDEFAULT.equals(intervalDate);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_QUANTITY:
				return netQuantity != NET_QUANTITY_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__NET_AMOUNT:
				return netAmount != NET_AMOUNT_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CURRENT_QUANTITY:
				return currentQuantity != CURRENT_QUANTITY_EDEFAULT;
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__INTERVAL_NUMBER:
				return INTERVAL_NUMBER_EDEFAULT == null ? intervalNumber != null : !INTERVAL_NUMBER_EDEFAULT.equals(intervalNumber);
			case MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__CONTAINER_MARKET_STATEMENT_LINE_ITEM:
				return containerMarketStatementLineItem != null;
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
		result.append(" (currentAmount: ");
		result.append(currentAmount);
		result.append(", previousISOAmount: ");
		result.append(previousISOAmount);
		result.append(", quantityUOM: ");
		result.append(quantityUOM);
		result.append(", netISOAmount: ");
		result.append(netISOAmount);
		result.append(", currentISOAmount: ");
		result.append(currentISOAmount);
		result.append(", previousQuantity: ");
		result.append(previousQuantity);
		result.append(", previousAmount: ");
		result.append(previousAmount);
		result.append(", netISOQuantity: ");
		result.append(netISOQuantity);
		result.append(", netPrice: ");
		result.append(netPrice);
		result.append(", currentISOQuantity: ");
		result.append(currentISOQuantity);
		result.append(", currentPrice: ");
		result.append(currentPrice);
		result.append(", previsouPrice: ");
		result.append(previsouPrice);
		result.append(", previousISOQuantity: ");
		result.append(previousISOQuantity);
		result.append(", intervalDate: ");
		result.append(intervalDate);
		result.append(", netQuantity: ");
		result.append(netQuantity);
		result.append(", netAmount: ");
		result.append(netAmount);
		result.append(", currentQuantity: ");
		result.append(currentQuantity);
		result.append(", intervalNumber: ");
		result.append(intervalNumber);
		result.append(')');
		return result.toString();
	}

} //MarketStatementLineItemImpl
