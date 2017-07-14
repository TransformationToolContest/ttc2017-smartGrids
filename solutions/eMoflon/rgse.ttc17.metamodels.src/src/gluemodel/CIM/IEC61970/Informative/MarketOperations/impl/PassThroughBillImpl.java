/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
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
 * An implementation of the model object '<em><b>Pass Through Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getBillEnd <em>Bill End</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getServiceEnd <em>Service End</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#isIsProfiled <em>Is Profiled</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getPreviousEnd <em>Previous End</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getBilledTo <em>Billed To</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#isIsDisputed <em>Is Disputed</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getMarketStatementLineItem <em>Market Statement Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getBillStart <em>Bill Start</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getPreviousStart <em>Previous Start</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getServiceStart <em>Service Start</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getBillRunType <em>Bill Run Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getChargeProfiles <em>Charge Profiles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getTradeDate <em>Trade Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getSoldTo <em>Sold To</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getPaidTo <em>Paid To</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PassThroughBillImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassThroughBillImpl extends DocumentImpl implements PassThroughBill {
	/**
	 * The default value of the '{@link #getBillEnd() <em>Bill End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date BILL_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillEnd() <em>Bill End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillEnd()
	 * @generated
	 * @ordered
	 */
	protected Date billEnd = BILL_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected Date effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceEnd() <em>Service End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date SERVICE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceEnd() <em>Service End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceEnd()
	 * @generated
	 * @ordered
	 */
	protected Date serviceEnd = SERVICE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsProfiled() <em>Is Profiled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProfiled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROFILED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProfiled() <em>Is Profiled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProfiled()
	 * @generated
	 * @ordered
	 */
	protected boolean isProfiled = IS_PROFILED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousEnd() <em>Previous End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date PREVIOUS_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviousEnd() <em>Previous End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousEnd()
	 * @generated
	 * @ordered
	 */
	protected Date previousEnd = PREVIOUS_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected String timeZone = TIME_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBilledTo() <em>Billed To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilledTo()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLED_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBilledTo() <em>Billed To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilledTo()
	 * @generated
	 * @ordered
	 */
	protected String billedTo = BILLED_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDisputed() <em>Is Disputed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisputed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPUTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisputed() <em>Is Disputed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisputed()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisputed = IS_DISPUTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvidedBy() <em>Provided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected String providedBy = PROVIDED_BY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarketStatementLineItem() <em>Market Statement Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketStatementLineItem()
	 * @generated
	 * @ordered
	 */
	protected MarketStatementLineItem marketStatementLineItem;

	/**
	 * The default value of the '{@link #getBillStart() <em>Bill Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date BILL_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillStart() <em>Bill Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillStart()
	 * @generated
	 * @ordered
	 */
	protected Date billStart = BILL_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousStart() <em>Previous Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date PREVIOUS_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviousStart() <em>Previous Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousStart()
	 * @generated
	 * @ordered
	 */
	protected Date previousStart = PREVIOUS_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceStart() <em>Service Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date SERVICE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceStart() <em>Service Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceStart()
	 * @generated
	 * @ordered
	 */
	protected Date serviceStart = SERVICE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductCode() <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCode() <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected String productCode = PRODUCT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillRunType() <em>Bill Run Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillRunType()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_RUN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillRunType() <em>Bill Run Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillRunType()
	 * @generated
	 * @ordered
	 */
	protected String billRunType = BILL_RUN_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getUserAttributes() <em>User Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> userAttributes;

	/**
	 * The cached value of the '{@link #getChargeProfiles() <em>Charge Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeProfile> chargeProfiles;

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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float TAX_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected float taxAmount = TAX_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoldTo() <em>Sold To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldTo()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLD_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoldTo() <em>Sold To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldTo()
	 * @generated
	 * @ordered
	 */
	protected String soldTo = SOLD_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected Date transactionDate = TRANSACTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaidTo() <em>Paid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PAID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaidTo() <em>Paid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidTo()
	 * @generated
	 * @ordered
	 */
	protected String paidTo = PAID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Object QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Object quantity = QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassThroughBillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.PASS_THROUGH_BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBillEnd() {
		return billEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillEnd(Date newBillEnd) {
		Date oldBillEnd = billEnd;
		billEnd = newBillEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__BILL_END, oldBillEnd, billEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDate(Date newEffectiveDate) {
		Date oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getServiceEnd() {
		return serviceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceEnd(Date newServiceEnd) {
		Date oldServiceEnd = serviceEnd;
		serviceEnd = newServiceEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_END, oldServiceEnd, serviceEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProfiled() {
		return isProfiled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProfiled(boolean newIsProfiled) {
		boolean oldIsProfiled = isProfiled;
		isProfiled = newIsProfiled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__IS_PROFILED, oldIsProfiled, isProfiled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPreviousEnd() {
		return previousEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousEnd(Date newPreviousEnd) {
		Date oldPreviousEnd = previousEnd;
		previousEnd = newPreviousEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_END, oldPreviousEnd, previousEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeZone(String newTimeZone) {
		String oldTimeZone = timeZone;
		timeZone = newTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__TIME_ZONE, oldTimeZone, timeZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBilledTo() {
		return billedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBilledTo(String newBilledTo) {
		String oldBilledTo = billedTo;
		billedTo = newBilledTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__BILLED_TO, oldBilledTo, billedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisputed() {
		return isDisputed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisputed(boolean newIsDisputed) {
		boolean oldIsDisputed = isDisputed;
		isDisputed = newIsDisputed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__IS_DISPUTED, oldIsDisputed, isDisputed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvidedBy() {
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedBy(String newProvidedBy) {
		String oldProvidedBy = providedBy;
		providedBy = newProvidedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__PROVIDED_BY, oldProvidedBy, providedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketStatementLineItem getMarketStatementLineItem() {
		if (marketStatementLineItem != null && marketStatementLineItem.eIsProxy()) {
			InternalEObject oldMarketStatementLineItem = (InternalEObject)marketStatementLineItem;
			marketStatementLineItem = (MarketStatementLineItem)eResolveProxy(oldMarketStatementLineItem);
			if (marketStatementLineItem != oldMarketStatementLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM, oldMarketStatementLineItem, marketStatementLineItem));
			}
		}
		return marketStatementLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketStatementLineItem basicGetMarketStatementLineItem() {
		return marketStatementLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketStatementLineItem(MarketStatementLineItem newMarketStatementLineItem, NotificationChain msgs) {
		MarketStatementLineItem oldMarketStatementLineItem = marketStatementLineItem;
		marketStatementLineItem = newMarketStatementLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM, oldMarketStatementLineItem, newMarketStatementLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketStatementLineItem(MarketStatementLineItem newMarketStatementLineItem) {
		if (newMarketStatementLineItem != marketStatementLineItem) {
			NotificationChain msgs = null;
			if (marketStatementLineItem != null)
				msgs = ((InternalEObject)marketStatementLineItem).eInverseRemove(this, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL, MarketStatementLineItem.class, msgs);
			if (newMarketStatementLineItem != null)
				msgs = ((InternalEObject)newMarketStatementLineItem).eInverseAdd(this, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL, MarketStatementLineItem.class, msgs);
			msgs = basicSetMarketStatementLineItem(newMarketStatementLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM, newMarketStatementLineItem, newMarketStatementLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBillStart() {
		return billStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillStart(Date newBillStart) {
		Date oldBillStart = billStart;
		billStart = newBillStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__BILL_START, oldBillStart, billStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPreviousStart() {
		return previousStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousStart(Date newPreviousStart) {
		Date oldPreviousStart = previousStart;
		previousStart = newPreviousStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_START, oldPreviousStart, previousStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getServiceStart() {
		return serviceStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceStart(Date newServiceStart) {
		Date oldServiceStart = serviceStart;
		serviceStart = newServiceStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_START, oldServiceStart, serviceStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCode(String newProductCode) {
		String oldProductCode = productCode;
		productCode = newProductCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__PRODUCT_CODE, oldProductCode, productCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillRunType() {
		return billRunType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillRunType(String newBillRunType) {
		String oldBillRunType = billRunType;
		billRunType = newBillRunType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__BILL_RUN_TYPE, oldBillRunType, billRunType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_TYPE, oldTransactionType, transactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getUserAttributes() {
		if (userAttributes == null) {
			userAttributes = new EObjectWithInverseResolvingEList.ManyInverse<UserAttribute>(UserAttribute.class, this, MarketOperationsPackage.PASS_THROUGH_BILL__USER_ATTRIBUTES, CommonPackage.USER_ATTRIBUTE__PASS_THROUGH_BILLS);
		}
		return userAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChargeProfile> getChargeProfiles() {
		if (chargeProfiles == null) {
			chargeProfiles = new EObjectWithInverseResolvingEList<ChargeProfile>(ChargeProfile.class, this, MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES, MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL);
		}
		return chargeProfiles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__TRADE_DATE, oldTradeDate, tradeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTaxAmount() {
		return taxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxAmount(float newTaxAmount) {
		float oldTaxAmount = taxAmount;
		taxAmount = newTaxAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__TAX_AMOUNT, oldTaxAmount, taxAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoldTo() {
		return soldTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoldTo(String newSoldTo) {
		String oldSoldTo = soldTo;
		soldTo = newSoldTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__SOLD_TO, oldSoldTo, soldTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionDate(Date newTransactionDate) {
		Date oldTransactionDate = transactionDate;
		transactionDate = newTransactionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_DATE, oldTransactionDate, transactionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaidTo() {
		return paidTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaidTo(String newPaidTo) {
		String oldPaidTo = paidTo;
		paidTo = newPaidTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__PAID_TO, oldPaidTo, paidTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Object newQuantity) {
		Object oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PASS_THROUGH_BILL__QUANTITY, oldQuantity, quantity));
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
			case MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM:
				if (marketStatementLineItem != null)
					msgs = ((InternalEObject)marketStatementLineItem).eInverseRemove(this, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__PASS_THROUGH_BILL, MarketStatementLineItem.class, msgs);
				return basicSetMarketStatementLineItem((MarketStatementLineItem)otherEnd, msgs);
			case MarketOperationsPackage.PASS_THROUGH_BILL__USER_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserAttributes()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChargeProfiles()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM:
				return basicSetMarketStatementLineItem(null, msgs);
			case MarketOperationsPackage.PASS_THROUGH_BILL__USER_ATTRIBUTES:
				return ((InternalEList<?>)getUserAttributes()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES:
				return ((InternalEList<?>)getChargeProfiles()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_END:
				return getBillEnd();
			case MarketOperationsPackage.PASS_THROUGH_BILL__EFFECTIVE_DATE:
				return getEffectiveDate();
			case MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_END:
				return getServiceEnd();
			case MarketOperationsPackage.PASS_THROUGH_BILL__IS_PROFILED:
				return isIsProfiled();
			case MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_END:
				return getPreviousEnd();
			case MarketOperationsPackage.PASS_THROUGH_BILL__AMOUNT:
				return getAmount();
			case MarketOperationsPackage.PASS_THROUGH_BILL__TIME_ZONE:
				return getTimeZone();
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILLED_TO:
				return getBilledTo();
			case MarketOperationsPackage.PASS_THROUGH_BILL__IS_DISPUTED:
				return isIsDisputed();
			case MarketOperationsPackage.PASS_THROUGH_BILL__PROVIDED_BY:
				return getProvidedBy();
			case MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM:
				if (resolve) return getMarketStatementLineItem();
				return basicGetMarketStatementLineItem();
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_START:
				return getBillStart();
			case MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_START:
				return getPreviousStart();
			case MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_START:
				return getServiceStart();
			case MarketOperationsPackage.PASS_THROUGH_BILL__PRODUCT_CODE:
				return getProductCode();
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_RUN_TYPE:
				return getBillRunType();
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_TYPE:
				return getTransactionType();
			case MarketOperationsPackage.PASS_THROUGH_BILL__USER_ATTRIBUTES:
				return getUserAttributes();
			case MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES:
				return getChargeProfiles();
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRADE_DATE:
				return getTradeDate();
			case MarketOperationsPackage.PASS_THROUGH_BILL__PRICE:
				return getPrice();
			case MarketOperationsPackage.PASS_THROUGH_BILL__TAX_AMOUNT:
				return getTaxAmount();
			case MarketOperationsPackage.PASS_THROUGH_BILL__SOLD_TO:
				return getSoldTo();
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_DATE:
				return getTransactionDate();
			case MarketOperationsPackage.PASS_THROUGH_BILL__PAID_TO:
				return getPaidTo();
			case MarketOperationsPackage.PASS_THROUGH_BILL__QUANTITY:
				return getQuantity();
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
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_END:
				setBillEnd((Date)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__EFFECTIVE_DATE:
				setEffectiveDate((Date)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_END:
				setServiceEnd((Date)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__IS_PROFILED:
				setIsProfiled((Boolean)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_END:
				setPreviousEnd((Date)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__AMOUNT:
				setAmount((Float)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TIME_ZONE:
				setTimeZone((String)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILLED_TO:
				setBilledTo((String)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__IS_DISPUTED:
				setIsDisputed((Boolean)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PROVIDED_BY:
				setProvidedBy((String)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM:
				setMarketStatementLineItem((MarketStatementLineItem)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_START:
				setBillStart((Date)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_START:
				setPreviousStart((Date)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_START:
				setServiceStart((Date)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PRODUCT_CODE:
				setProductCode((String)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_RUN_TYPE:
				setBillRunType((String)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_TYPE:
				setTransactionType((String)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__USER_ATTRIBUTES:
				getUserAttributes().clear();
				getUserAttributes().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES:
				getChargeProfiles().clear();
				getChargeProfiles().addAll((Collection<? extends ChargeProfile>)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRADE_DATE:
				setTradeDate((Date)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PRICE:
				setPrice((Float)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TAX_AMOUNT:
				setTaxAmount((Float)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__SOLD_TO:
				setSoldTo((String)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_DATE:
				setTransactionDate((Date)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PAID_TO:
				setPaidTo((String)newValue);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__QUANTITY:
				setQuantity(newValue);
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
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_END:
				setBillEnd(BILL_END_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_END:
				setServiceEnd(SERVICE_END_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__IS_PROFILED:
				setIsProfiled(IS_PROFILED_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_END:
				setPreviousEnd(PREVIOUS_END_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TIME_ZONE:
				setTimeZone(TIME_ZONE_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILLED_TO:
				setBilledTo(BILLED_TO_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__IS_DISPUTED:
				setIsDisputed(IS_DISPUTED_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PROVIDED_BY:
				setProvidedBy(PROVIDED_BY_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM:
				setMarketStatementLineItem((MarketStatementLineItem)null);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_START:
				setBillStart(BILL_START_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_START:
				setPreviousStart(PREVIOUS_START_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_START:
				setServiceStart(SERVICE_START_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PRODUCT_CODE:
				setProductCode(PRODUCT_CODE_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_RUN_TYPE:
				setBillRunType(BILL_RUN_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_TYPE:
				setTransactionType(TRANSACTION_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__USER_ATTRIBUTES:
				getUserAttributes().clear();
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES:
				getChargeProfiles().clear();
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRADE_DATE:
				setTradeDate(TRADE_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TAX_AMOUNT:
				setTaxAmount(TAX_AMOUNT_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__SOLD_TO:
				setSoldTo(SOLD_TO_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PAID_TO:
				setPaidTo(PAID_TO_EDEFAULT);
				return;
			case MarketOperationsPackage.PASS_THROUGH_BILL__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
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
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_END:
				return BILL_END_EDEFAULT == null ? billEnd != null : !BILL_END_EDEFAULT.equals(billEnd);
			case MarketOperationsPackage.PASS_THROUGH_BILL__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null ? effectiveDate != null : !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_END:
				return SERVICE_END_EDEFAULT == null ? serviceEnd != null : !SERVICE_END_EDEFAULT.equals(serviceEnd);
			case MarketOperationsPackage.PASS_THROUGH_BILL__IS_PROFILED:
				return isProfiled != IS_PROFILED_EDEFAULT;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_END:
				return PREVIOUS_END_EDEFAULT == null ? previousEnd != null : !PREVIOUS_END_EDEFAULT.equals(previousEnd);
			case MarketOperationsPackage.PASS_THROUGH_BILL__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TIME_ZONE:
				return TIME_ZONE_EDEFAULT == null ? timeZone != null : !TIME_ZONE_EDEFAULT.equals(timeZone);
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILLED_TO:
				return BILLED_TO_EDEFAULT == null ? billedTo != null : !BILLED_TO_EDEFAULT.equals(billedTo);
			case MarketOperationsPackage.PASS_THROUGH_BILL__IS_DISPUTED:
				return isDisputed != IS_DISPUTED_EDEFAULT;
			case MarketOperationsPackage.PASS_THROUGH_BILL__PROVIDED_BY:
				return PROVIDED_BY_EDEFAULT == null ? providedBy != null : !PROVIDED_BY_EDEFAULT.equals(providedBy);
			case MarketOperationsPackage.PASS_THROUGH_BILL__MARKET_STATEMENT_LINE_ITEM:
				return marketStatementLineItem != null;
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_START:
				return BILL_START_EDEFAULT == null ? billStart != null : !BILL_START_EDEFAULT.equals(billStart);
			case MarketOperationsPackage.PASS_THROUGH_BILL__PREVIOUS_START:
				return PREVIOUS_START_EDEFAULT == null ? previousStart != null : !PREVIOUS_START_EDEFAULT.equals(previousStart);
			case MarketOperationsPackage.PASS_THROUGH_BILL__SERVICE_START:
				return SERVICE_START_EDEFAULT == null ? serviceStart != null : !SERVICE_START_EDEFAULT.equals(serviceStart);
			case MarketOperationsPackage.PASS_THROUGH_BILL__PRODUCT_CODE:
				return PRODUCT_CODE_EDEFAULT == null ? productCode != null : !PRODUCT_CODE_EDEFAULT.equals(productCode);
			case MarketOperationsPackage.PASS_THROUGH_BILL__BILL_RUN_TYPE:
				return BILL_RUN_TYPE_EDEFAULT == null ? billRunType != null : !BILL_RUN_TYPE_EDEFAULT.equals(billRunType);
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_TYPE:
				return TRANSACTION_TYPE_EDEFAULT == null ? transactionType != null : !TRANSACTION_TYPE_EDEFAULT.equals(transactionType);
			case MarketOperationsPackage.PASS_THROUGH_BILL__USER_ATTRIBUTES:
				return userAttributes != null && !userAttributes.isEmpty();
			case MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES:
				return chargeProfiles != null && !chargeProfiles.isEmpty();
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRADE_DATE:
				return TRADE_DATE_EDEFAULT == null ? tradeDate != null : !TRADE_DATE_EDEFAULT.equals(tradeDate);
			case MarketOperationsPackage.PASS_THROUGH_BILL__PRICE:
				return price != PRICE_EDEFAULT;
			case MarketOperationsPackage.PASS_THROUGH_BILL__TAX_AMOUNT:
				return taxAmount != TAX_AMOUNT_EDEFAULT;
			case MarketOperationsPackage.PASS_THROUGH_BILL__SOLD_TO:
				return SOLD_TO_EDEFAULT == null ? soldTo != null : !SOLD_TO_EDEFAULT.equals(soldTo);
			case MarketOperationsPackage.PASS_THROUGH_BILL__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case MarketOperationsPackage.PASS_THROUGH_BILL__PAID_TO:
				return PAID_TO_EDEFAULT == null ? paidTo != null : !PAID_TO_EDEFAULT.equals(paidTo);
			case MarketOperationsPackage.PASS_THROUGH_BILL__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
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
		result.append(" (billEnd: ");
		result.append(billEnd);
		result.append(", effectiveDate: ");
		result.append(effectiveDate);
		result.append(", serviceEnd: ");
		result.append(serviceEnd);
		result.append(", isProfiled: ");
		result.append(isProfiled);
		result.append(", previousEnd: ");
		result.append(previousEnd);
		result.append(", amount: ");
		result.append(amount);
		result.append(", timeZone: ");
		result.append(timeZone);
		result.append(", billedTo: ");
		result.append(billedTo);
		result.append(", isDisputed: ");
		result.append(isDisputed);
		result.append(", providedBy: ");
		result.append(providedBy);
		result.append(", billStart: ");
		result.append(billStart);
		result.append(", previousStart: ");
		result.append(previousStart);
		result.append(", serviceStart: ");
		result.append(serviceStart);
		result.append(", productCode: ");
		result.append(productCode);
		result.append(", billRunType: ");
		result.append(billRunType);
		result.append(", transactionType: ");
		result.append(transactionType);
		result.append(", tradeDate: ");
		result.append(tradeDate);
		result.append(", price: ");
		result.append(price);
		result.append(", taxAmount: ");
		result.append(taxAmount);
		result.append(", soldTo: ");
		result.append(soldTo);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", paidTo: ");
		result.append(paidTo);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //PassThroughBillImpl
