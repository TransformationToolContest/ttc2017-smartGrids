/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.Assets.Asset;
import CIM.IEC61968.Assets.AssetsPackage;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.FinancialInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Financial Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getWarrantyEndDateTime <em>Warranty End Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getActualPurchaseCost <em>Actual Purchase Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getPurchaseDateTime <em>Purchase Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getPurchaseOrderNumber <em>Purchase Order Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getFinancialValue <em>Financial Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.FinancialInfoImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinancialInfoImpl extends IdentifiedObjectImpl implements FinancialInfo {
	/**
	 * The default value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected String costType = COST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected String costDescription = COST_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected String account = ACCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlantTransferDateTime() <em>Plant Transfer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantTransferDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PLANT_TRANSFER_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlantTransferDateTime() <em>Plant Transfer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantTransferDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date plantTransferDateTime = PLANT_TRANSFER_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarrantyEndDateTime() <em>Warranty End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date WARRANTY_END_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarrantyEndDateTime() <em>Warranty End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date warrantyEndDateTime = WARRANTY_END_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualPurchaseCost() <em>Actual Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualPurchaseCost()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTUAL_PURCHASE_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActualPurchaseCost() <em>Actual Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualPurchaseCost()
	 * @generated
	 * @ordered
	 */
	protected float actualPurchaseCost = ACTUAL_PURCHASE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchaseDateTime() <em>Purchase Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PURCHASE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseDateTime() <em>Purchase Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date purchaseDateTime = PURCHASE_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchaseOrderNumber() <em>Purchase Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PURCHASE_ORDER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseOrderNumber() <em>Purchase Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected String purchaseOrderNumber = PURCHASE_ORDER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinancialValue() <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialValue()
	 * @generated
	 * @ordered
	 */
	protected static final float FINANCIAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFinancialValue() <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialValue()
	 * @generated
	 * @ordered
	 */
	protected float financialValue = FINANCIAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALUE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date valueDateTime = VALUE_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinancialInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getFinancialInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCostType() {
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostType(String newCostType) {
		String oldCostType = costType;
		costType = newCostType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__COST_TYPE, oldCostType, costType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCostDescription() {
		return costDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostDescription(String newCostDescription) {
		String oldCostDescription = costDescription;
		costDescription = newCostDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__COST_DESCRIPTION, oldCostDescription, costDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(String newAccount) {
		String oldAccount = account;
		account = newAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__ACCOUNT, oldAccount, account));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPlantTransferDateTime() {
		return plantTransferDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantTransferDateTime(Date newPlantTransferDateTime) {
		Date oldPlantTransferDateTime = plantTransferDateTime;
		plantTransferDateTime = newPlantTransferDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME, oldPlantTransferDateTime, plantTransferDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWarrantyEndDateTime() {
		return warrantyEndDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarrantyEndDateTime(Date newWarrantyEndDateTime) {
		Date oldWarrantyEndDateTime = warrantyEndDateTime;
		warrantyEndDateTime = newWarrantyEndDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME, oldWarrantyEndDateTime, warrantyEndDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getActualPurchaseCost() {
		return actualPurchaseCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualPurchaseCost(float newActualPurchaseCost) {
		float oldActualPurchaseCost = actualPurchaseCost;
		actualPurchaseCost = newActualPurchaseCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST, oldActualPurchaseCost, actualPurchaseCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPurchaseDateTime() {
		return purchaseDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurchaseDateTime(Date newPurchaseDateTime) {
		Date oldPurchaseDateTime = purchaseDateTime;
		purchaseDateTime = newPurchaseDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME, oldPurchaseDateTime, purchaseDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurchaseOrderNumber(String newPurchaseOrderNumber) {
		String oldPurchaseOrderNumber = purchaseOrderNumber;
		purchaseOrderNumber = newPurchaseOrderNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER, oldPurchaseOrderNumber, purchaseOrderNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFinancialValue() {
		return financialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinancialValue(float newFinancialValue) {
		float oldFinancialValue = financialValue;
		financialValue = newFinancialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__FINANCIAL_VALUE, oldFinancialValue, financialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(BigInteger newQuantity) {
		BigInteger oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDateTime(Date newValueDateTime) {
		Date oldValueDateTime = valueDateTime;
		valueDateTime = newValueDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__VALUE_DATE_TIME, oldValueDateTime, valueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.FINANCIAL_INFO__ASSET, oldAsset, asset));
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__ASSET, oldAsset, newAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__FINANCIAL_INFO, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, AssetsPackage.ASSET__FINANCIAL_INFO, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FINANCIAL_INFO__ASSET, newAsset, newAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__FINANCIAL_INFO, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
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
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				return basicSetAsset(null, msgs);
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
			case InfAssetsPackage.FINANCIAL_INFO__COST_TYPE:
				return getCostType();
			case InfAssetsPackage.FINANCIAL_INFO__COST_DESCRIPTION:
				return getCostDescription();
			case InfAssetsPackage.FINANCIAL_INFO__ACCOUNT:
				return getAccount();
			case InfAssetsPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
				return getPlantTransferDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
				return getWarrantyEndDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
				return getActualPurchaseCost();
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
				return getPurchaseDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
				return getPurchaseOrderNumber();
			case InfAssetsPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
				return getFinancialValue();
			case InfAssetsPackage.FINANCIAL_INFO__QUANTITY:
				return getQuantity();
			case InfAssetsPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
				return getValueDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
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
			case InfAssetsPackage.FINANCIAL_INFO__COST_TYPE:
				setCostType((String)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__COST_DESCRIPTION:
				setCostDescription((String)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ACCOUNT:
				setAccount((String)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
				setPlantTransferDateTime((Date)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
				setWarrantyEndDateTime((Date)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
				setActualPurchaseCost((Float)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
				setPurchaseDateTime((Date)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
				setPurchaseOrderNumber((String)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
				setFinancialValue((Float)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
				setValueDateTime((Date)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				setAsset((Asset)newValue);
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
			case InfAssetsPackage.FINANCIAL_INFO__COST_TYPE:
				setCostType(COST_TYPE_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__COST_DESCRIPTION:
				setCostDescription(COST_DESCRIPTION_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ACCOUNT:
				setAccount(ACCOUNT_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
				setPlantTransferDateTime(PLANT_TRANSFER_DATE_TIME_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
				setWarrantyEndDateTime(WARRANTY_END_DATE_TIME_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
				setActualPurchaseCost(ACTUAL_PURCHASE_COST_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
				setPurchaseDateTime(PURCHASE_DATE_TIME_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
				setPurchaseOrderNumber(PURCHASE_ORDER_NUMBER_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
				setFinancialValue(FINANCIAL_VALUE_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
				setValueDateTime(VALUE_DATE_TIME_EDEFAULT);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				setAsset((Asset)null);
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
			case InfAssetsPackage.FINANCIAL_INFO__COST_TYPE:
				return COST_TYPE_EDEFAULT == null ? costType != null : !COST_TYPE_EDEFAULT.equals(costType);
			case InfAssetsPackage.FINANCIAL_INFO__COST_DESCRIPTION:
				return COST_DESCRIPTION_EDEFAULT == null ? costDescription != null : !COST_DESCRIPTION_EDEFAULT.equals(costDescription);
			case InfAssetsPackage.FINANCIAL_INFO__ACCOUNT:
				return ACCOUNT_EDEFAULT == null ? account != null : !ACCOUNT_EDEFAULT.equals(account);
			case InfAssetsPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
				return PLANT_TRANSFER_DATE_TIME_EDEFAULT == null ? plantTransferDateTime != null : !PLANT_TRANSFER_DATE_TIME_EDEFAULT.equals(plantTransferDateTime);
			case InfAssetsPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
				return WARRANTY_END_DATE_TIME_EDEFAULT == null ? warrantyEndDateTime != null : !WARRANTY_END_DATE_TIME_EDEFAULT.equals(warrantyEndDateTime);
			case InfAssetsPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
				return actualPurchaseCost != ACTUAL_PURCHASE_COST_EDEFAULT;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
				return PURCHASE_DATE_TIME_EDEFAULT == null ? purchaseDateTime != null : !PURCHASE_DATE_TIME_EDEFAULT.equals(purchaseDateTime);
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
				return PURCHASE_ORDER_NUMBER_EDEFAULT == null ? purchaseOrderNumber != null : !PURCHASE_ORDER_NUMBER_EDEFAULT.equals(purchaseOrderNumber);
			case InfAssetsPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
				return financialValue != FINANCIAL_VALUE_EDEFAULT;
			case InfAssetsPackage.FINANCIAL_INFO__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InfAssetsPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
				return VALUE_DATE_TIME_EDEFAULT == null ? valueDateTime != null : !VALUE_DATE_TIME_EDEFAULT.equals(valueDateTime);
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				return asset != null;
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
		result.append(" (costType: ");
		result.append(costType);
		result.append(", costDescription: ");
		result.append(costDescription);
		result.append(", account: ");
		result.append(account);
		result.append(", plantTransferDateTime: ");
		result.append(plantTransferDateTime);
		result.append(", warrantyEndDateTime: ");
		result.append(warrantyEndDateTime);
		result.append(", actualPurchaseCost: ");
		result.append(actualPurchaseCost);
		result.append(", purchaseDateTime: ");
		result.append(purchaseDateTime);
		result.append(", purchaseOrderNumber: ");
		result.append(purchaseOrderNumber);
		result.append(", financialValue: ");
		result.append(financialValue);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", valueDateTime: ");
		result.append(valueDateTime);
		result.append(')');
		return result.toString();
	}

} //FinancialInfoImpl
