/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.ResourceBid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Bid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl#getStartUpsMaxWeek <em>Start Ups Max Week</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl#getCommodityType <em>Commodity Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl#getEnergyMaxDay <em>Energy Max Day</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl#getEnergyMinDay <em>Energy Min Day</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl#isVirtual <em>Virtual</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl#getShutDownsMaxWeek <em>Shut Downs Max Week</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl#getShutDownsMaxDay <em>Shut Downs Max Day</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ResourceBidImpl#getStartUpsMaxDay <em>Start Ups Max Day</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceBidImpl extends BidImpl implements ResourceBid {
	/**
	 * The default value of the '{@link #getStartUpsMaxWeek() <em>Start Ups Max Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpsMaxWeek()
	 * @generated
	 * @ordered
	 */
	protected static final int START_UPS_MAX_WEEK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartUpsMaxWeek() <em>Start Ups Max Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpsMaxWeek()
	 * @generated
	 * @ordered
	 */
	protected int startUpsMaxWeek = START_UPS_MAX_WEEK_EDEFAULT;

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
	 * The default value of the '{@link #getEnergyMaxDay() <em>Energy Max Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMaxDay()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_MAX_DAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyMaxDay() <em>Energy Max Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMaxDay()
	 * @generated
	 * @ordered
	 */
	protected float energyMaxDay = ENERGY_MAX_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyMinDay() <em>Energy Min Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMinDay()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_MIN_DAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyMinDay() <em>Energy Min Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMinDay()
	 * @generated
	 * @ordered
	 */
	protected float energyMinDay = ENERGY_MIN_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIRTUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVirtual()
	 * @generated
	 * @ordered
	 */
	protected boolean virtual = VIRTUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getShutDownsMaxWeek() <em>Shut Downs Max Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutDownsMaxWeek()
	 * @generated
	 * @ordered
	 */
	protected static final int SHUT_DOWNS_MAX_WEEK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShutDownsMaxWeek() <em>Shut Downs Max Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutDownsMaxWeek()
	 * @generated
	 * @ordered
	 */
	protected int shutDownsMaxWeek = SHUT_DOWNS_MAX_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getShutDownsMaxDay() <em>Shut Downs Max Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutDownsMaxDay()
	 * @generated
	 * @ordered
	 */
	protected static final int SHUT_DOWNS_MAX_DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShutDownsMaxDay() <em>Shut Downs Max Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutDownsMaxDay()
	 * @generated
	 * @ordered
	 */
	protected int shutDownsMaxDay = SHUT_DOWNS_MAX_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartUpsMaxDay() <em>Start Ups Max Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpsMaxDay()
	 * @generated
	 * @ordered
	 */
	protected static final int START_UPS_MAX_DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartUpsMaxDay() <em>Start Ups Max Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpsMaxDay()
	 * @generated
	 * @ordered
	 */
	protected int startUpsMaxDay = START_UPS_MAX_DAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceBidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.RESOURCE_BID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartUpsMaxWeek() {
		return startUpsMaxWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartUpsMaxWeek(int newStartUpsMaxWeek) {
		int oldStartUpsMaxWeek = startUpsMaxWeek;
		startUpsMaxWeek = newStartUpsMaxWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_WEEK, oldStartUpsMaxWeek, startUpsMaxWeek));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_BID__COMMODITY_TYPE, oldCommodityType, commodityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyMaxDay() {
		return energyMaxDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyMaxDay(float newEnergyMaxDay) {
		float oldEnergyMaxDay = energyMaxDay;
		energyMaxDay = newEnergyMaxDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_BID__ENERGY_MAX_DAY, oldEnergyMaxDay, energyMaxDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyMinDay() {
		return energyMinDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyMinDay(float newEnergyMinDay) {
		float oldEnergyMinDay = energyMinDay;
		energyMinDay = newEnergyMinDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_BID__ENERGY_MIN_DAY, oldEnergyMinDay, energyMinDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVirtual() {
		return virtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtual(boolean newVirtual) {
		boolean oldVirtual = virtual;
		virtual = newVirtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_BID__VIRTUAL, oldVirtual, virtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShutDownsMaxWeek() {
		return shutDownsMaxWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShutDownsMaxWeek(int newShutDownsMaxWeek) {
		int oldShutDownsMaxWeek = shutDownsMaxWeek;
		shutDownsMaxWeek = newShutDownsMaxWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_WEEK, oldShutDownsMaxWeek, shutDownsMaxWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShutDownsMaxDay() {
		return shutDownsMaxDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShutDownsMaxDay(int newShutDownsMaxDay) {
		int oldShutDownsMaxDay = shutDownsMaxDay;
		shutDownsMaxDay = newShutDownsMaxDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_DAY, oldShutDownsMaxDay, shutDownsMaxDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartUpsMaxDay() {
		return startUpsMaxDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartUpsMaxDay(int newStartUpsMaxDay) {
		int oldStartUpsMaxDay = startUpsMaxDay;
		startUpsMaxDay = newStartUpsMaxDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_DAY, oldStartUpsMaxDay, startUpsMaxDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_WEEK:
				return getStartUpsMaxWeek();
			case MarketOperationsPackage.RESOURCE_BID__COMMODITY_TYPE:
				return getCommodityType();
			case MarketOperationsPackage.RESOURCE_BID__ENERGY_MAX_DAY:
				return getEnergyMaxDay();
			case MarketOperationsPackage.RESOURCE_BID__ENERGY_MIN_DAY:
				return getEnergyMinDay();
			case MarketOperationsPackage.RESOURCE_BID__VIRTUAL:
				return isVirtual();
			case MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_WEEK:
				return getShutDownsMaxWeek();
			case MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_DAY:
				return getShutDownsMaxDay();
			case MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_DAY:
				return getStartUpsMaxDay();
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
			case MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_WEEK:
				setStartUpsMaxWeek((Integer)newValue);
				return;
			case MarketOperationsPackage.RESOURCE_BID__COMMODITY_TYPE:
				setCommodityType((String)newValue);
				return;
			case MarketOperationsPackage.RESOURCE_BID__ENERGY_MAX_DAY:
				setEnergyMaxDay((Float)newValue);
				return;
			case MarketOperationsPackage.RESOURCE_BID__ENERGY_MIN_DAY:
				setEnergyMinDay((Float)newValue);
				return;
			case MarketOperationsPackage.RESOURCE_BID__VIRTUAL:
				setVirtual((Boolean)newValue);
				return;
			case MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_WEEK:
				setShutDownsMaxWeek((Integer)newValue);
				return;
			case MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_DAY:
				setShutDownsMaxDay((Integer)newValue);
				return;
			case MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_DAY:
				setStartUpsMaxDay((Integer)newValue);
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
			case MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_WEEK:
				setStartUpsMaxWeek(START_UPS_MAX_WEEK_EDEFAULT);
				return;
			case MarketOperationsPackage.RESOURCE_BID__COMMODITY_TYPE:
				setCommodityType(COMMODITY_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.RESOURCE_BID__ENERGY_MAX_DAY:
				setEnergyMaxDay(ENERGY_MAX_DAY_EDEFAULT);
				return;
			case MarketOperationsPackage.RESOURCE_BID__ENERGY_MIN_DAY:
				setEnergyMinDay(ENERGY_MIN_DAY_EDEFAULT);
				return;
			case MarketOperationsPackage.RESOURCE_BID__VIRTUAL:
				setVirtual(VIRTUAL_EDEFAULT);
				return;
			case MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_WEEK:
				setShutDownsMaxWeek(SHUT_DOWNS_MAX_WEEK_EDEFAULT);
				return;
			case MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_DAY:
				setShutDownsMaxDay(SHUT_DOWNS_MAX_DAY_EDEFAULT);
				return;
			case MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_DAY:
				setStartUpsMaxDay(START_UPS_MAX_DAY_EDEFAULT);
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
			case MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_WEEK:
				return startUpsMaxWeek != START_UPS_MAX_WEEK_EDEFAULT;
			case MarketOperationsPackage.RESOURCE_BID__COMMODITY_TYPE:
				return COMMODITY_TYPE_EDEFAULT == null ? commodityType != null : !COMMODITY_TYPE_EDEFAULT.equals(commodityType);
			case MarketOperationsPackage.RESOURCE_BID__ENERGY_MAX_DAY:
				return energyMaxDay != ENERGY_MAX_DAY_EDEFAULT;
			case MarketOperationsPackage.RESOURCE_BID__ENERGY_MIN_DAY:
				return energyMinDay != ENERGY_MIN_DAY_EDEFAULT;
			case MarketOperationsPackage.RESOURCE_BID__VIRTUAL:
				return virtual != VIRTUAL_EDEFAULT;
			case MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_WEEK:
				return shutDownsMaxWeek != SHUT_DOWNS_MAX_WEEK_EDEFAULT;
			case MarketOperationsPackage.RESOURCE_BID__SHUT_DOWNS_MAX_DAY:
				return shutDownsMaxDay != SHUT_DOWNS_MAX_DAY_EDEFAULT;
			case MarketOperationsPackage.RESOURCE_BID__START_UPS_MAX_DAY:
				return startUpsMaxDay != START_UPS_MAX_DAY_EDEFAULT;
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
		result.append(" (startUpsMaxWeek: ");
		result.append(startUpsMaxWeek);
		result.append(", commodityType: ");
		result.append(commodityType);
		result.append(", energyMaxDay: ");
		result.append(energyMaxDay);
		result.append(", energyMinDay: ");
		result.append(energyMinDay);
		result.append(", virtual: ");
		result.append(virtual);
		result.append(", shutDownsMaxWeek: ");
		result.append(shutDownsMaxWeek);
		result.append(", shutDownsMaxDay: ");
		result.append(shutDownsMaxDay);
		result.append(", startUpsMaxDay: ");
		result.append(startUpsMaxDay);
		result.append(')');
		return result.toString();
	}

} //ResourceBidImpl
