/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.BidClearing;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bid Clearing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidClearingImpl#getStartUpCost <em>Start Up Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidClearingImpl#getBid <em>Bid</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidClearingImpl#getNoLoadCost <em>No Load Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BidClearingImpl#getLostOpCost <em>Lost Op Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BidClearingImpl extends ElementImpl implements BidClearing {
	/**
	 * The default value of the '{@link #getStartUpCost() <em>Start Up Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpCost()
	 * @generated
	 * @ordered
	 */
	protected static final float START_UP_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartUpCost() <em>Start Up Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartUpCost()
	 * @generated
	 * @ordered
	 */
	protected float startUpCost = START_UP_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBid() <em>Bid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBid()
	 * @generated
	 * @ordered
	 */
	protected Bid bid;

	/**
	 * The default value of the '{@link #getNoLoadCost() <em>No Load Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadCost()
	 * @generated
	 * @ordered
	 */
	protected static final float NO_LOAD_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNoLoadCost() <em>No Load Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadCost()
	 * @generated
	 * @ordered
	 */
	protected float noLoadCost = NO_LOAD_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLostOpCost() <em>Lost Op Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLostOpCost()
	 * @generated
	 * @ordered
	 */
	protected static final float LOST_OP_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLostOpCost() <em>Lost Op Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLostOpCost()
	 * @generated
	 * @ordered
	 */
	protected float lostOpCost = LOST_OP_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BidClearingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.BID_CLEARING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStartUpCost() {
		return startUpCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartUpCost(float newStartUpCost) {
		float oldStartUpCost = startUpCost;
		startUpCost = newStartUpCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID_CLEARING__START_UP_COST, oldStartUpCost, startUpCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bid getBid() {
		if (bid != null && bid.eIsProxy()) {
			InternalEObject oldBid = (InternalEObject)bid;
			bid = (Bid)eResolveProxy(oldBid);
			if (bid != oldBid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.BID_CLEARING__BID, oldBid, bid));
			}
		}
		return bid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bid basicGetBid() {
		return bid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBid(Bid newBid, NotificationChain msgs) {
		Bid oldBid = bid;
		bid = newBid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID_CLEARING__BID, oldBid, newBid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBid(Bid newBid) {
		if (newBid != bid) {
			NotificationChain msgs = null;
			if (bid != null)
				msgs = ((InternalEObject)bid).eInverseRemove(this, MarketOperationsPackage.BID__BID_CLEARING, Bid.class, msgs);
			if (newBid != null)
				msgs = ((InternalEObject)newBid).eInverseAdd(this, MarketOperationsPackage.BID__BID_CLEARING, Bid.class, msgs);
			msgs = basicSetBid(newBid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID_CLEARING__BID, newBid, newBid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNoLoadCost() {
		return noLoadCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoLoadCost(float newNoLoadCost) {
		float oldNoLoadCost = noLoadCost;
		noLoadCost = newNoLoadCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID_CLEARING__NO_LOAD_COST, oldNoLoadCost, noLoadCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLostOpCost() {
		return lostOpCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLostOpCost(float newLostOpCost) {
		float oldLostOpCost = lostOpCost;
		lostOpCost = newLostOpCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BID_CLEARING__LOST_OP_COST, oldLostOpCost, lostOpCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.BID_CLEARING__BID:
				if (bid != null)
					msgs = ((InternalEObject)bid).eInverseRemove(this, MarketOperationsPackage.BID__BID_CLEARING, Bid.class, msgs);
				return basicSetBid((Bid)otherEnd, msgs);
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
			case MarketOperationsPackage.BID_CLEARING__BID:
				return basicSetBid(null, msgs);
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
			case MarketOperationsPackage.BID_CLEARING__START_UP_COST:
				return getStartUpCost();
			case MarketOperationsPackage.BID_CLEARING__BID:
				if (resolve) return getBid();
				return basicGetBid();
			case MarketOperationsPackage.BID_CLEARING__NO_LOAD_COST:
				return getNoLoadCost();
			case MarketOperationsPackage.BID_CLEARING__LOST_OP_COST:
				return getLostOpCost();
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
			case MarketOperationsPackage.BID_CLEARING__START_UP_COST:
				setStartUpCost((Float)newValue);
				return;
			case MarketOperationsPackage.BID_CLEARING__BID:
				setBid((Bid)newValue);
				return;
			case MarketOperationsPackage.BID_CLEARING__NO_LOAD_COST:
				setNoLoadCost((Float)newValue);
				return;
			case MarketOperationsPackage.BID_CLEARING__LOST_OP_COST:
				setLostOpCost((Float)newValue);
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
			case MarketOperationsPackage.BID_CLEARING__START_UP_COST:
				setStartUpCost(START_UP_COST_EDEFAULT);
				return;
			case MarketOperationsPackage.BID_CLEARING__BID:
				setBid((Bid)null);
				return;
			case MarketOperationsPackage.BID_CLEARING__NO_LOAD_COST:
				setNoLoadCost(NO_LOAD_COST_EDEFAULT);
				return;
			case MarketOperationsPackage.BID_CLEARING__LOST_OP_COST:
				setLostOpCost(LOST_OP_COST_EDEFAULT);
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
			case MarketOperationsPackage.BID_CLEARING__START_UP_COST:
				return startUpCost != START_UP_COST_EDEFAULT;
			case MarketOperationsPackage.BID_CLEARING__BID:
				return bid != null;
			case MarketOperationsPackage.BID_CLEARING__NO_LOAD_COST:
				return noLoadCost != NO_LOAD_COST_EDEFAULT;
			case MarketOperationsPackage.BID_CLEARING__LOST_OP_COST:
				return lostOpCost != LOST_OP_COST_EDEFAULT;
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
		result.append(" (startUpCost: ");
		result.append(startUpCost);
		result.append(", noLoadCost: ");
		result.append(noLoadCost);
		result.append(", lostOpCost: ");
		result.append(lostOpCost);
		result.append(')');
		return result.toString();
	}

} //BidClearingImpl
