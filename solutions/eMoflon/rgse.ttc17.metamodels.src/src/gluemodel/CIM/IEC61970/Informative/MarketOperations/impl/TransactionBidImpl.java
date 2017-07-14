/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Transaction Bid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransactionBidImpl#getEnergyTransId <em>Energy Trans Id</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransactionBidImpl#getEnergyProfiles <em>Energy Profiles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransactionBidImpl#getDelivery_Pnode <em>Delivery Pnode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.TransactionBidImpl#getReceipt_Pnode <em>Receipt Pnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionBidImpl extends BidImpl implements TransactionBid {
	/**
	 * The default value of the '{@link #getEnergyTransId() <em>Energy Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyTransId()
	 * @generated
	 * @ordered
	 */
	protected static final String ENERGY_TRANS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnergyTransId() <em>Energy Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyTransId()
	 * @generated
	 * @ordered
	 */
	protected String energyTransId = ENERGY_TRANS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnergyProfiles() <em>Energy Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyProfile> energyProfiles;

	/**
	 * The cached value of the '{@link #getDelivery_Pnode() <em>Delivery Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery_Pnode()
	 * @generated
	 * @ordered
	 */
	protected Pnode delivery_Pnode;

	/**
	 * The cached value of the '{@link #getReceipt_Pnode() <em>Receipt Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceipt_Pnode()
	 * @generated
	 * @ordered
	 */
	protected Pnode receipt_Pnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionBidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.TRANSACTION_BID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnergyTransId() {
		return energyTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyTransId(String newEnergyTransId) {
		String oldEnergyTransId = energyTransId;
		energyTransId = newEnergyTransId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.TRANSACTION_BID__ENERGY_TRANS_ID, oldEnergyTransId, energyTransId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyProfile> getEnergyProfiles() {
		if (energyProfiles == null) {
			energyProfiles = new EObjectWithInverseResolvingEList<EnergyProfile>(EnergyProfile.class, this, MarketOperationsPackage.TRANSACTION_BID__ENERGY_PROFILES, EnergySchedulingPackage.ENERGY_PROFILE__TRANSACTION_BID);
		}
		return energyProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode getDelivery_Pnode() {
		if (delivery_Pnode != null && delivery_Pnode.eIsProxy()) {
			InternalEObject oldDelivery_Pnode = (InternalEObject)delivery_Pnode;
			delivery_Pnode = (Pnode)eResolveProxy(oldDelivery_Pnode);
			if (delivery_Pnode != oldDelivery_Pnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE, oldDelivery_Pnode, delivery_Pnode));
			}
		}
		return delivery_Pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode basicGetDelivery_Pnode() {
		return delivery_Pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelivery_Pnode(Pnode newDelivery_Pnode, NotificationChain msgs) {
		Pnode oldDelivery_Pnode = delivery_Pnode;
		delivery_Pnode = newDelivery_Pnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE, oldDelivery_Pnode, newDelivery_Pnode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelivery_Pnode(Pnode newDelivery_Pnode) {
		if (newDelivery_Pnode != delivery_Pnode) {
			NotificationChain msgs = null;
			if (delivery_Pnode != null)
				msgs = ((InternalEObject)delivery_Pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS, Pnode.class, msgs);
			if (newDelivery_Pnode != null)
				msgs = ((InternalEObject)newDelivery_Pnode).eInverseAdd(this, MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS, Pnode.class, msgs);
			msgs = basicSetDelivery_Pnode(newDelivery_Pnode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE, newDelivery_Pnode, newDelivery_Pnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode getReceipt_Pnode() {
		if (receipt_Pnode != null && receipt_Pnode.eIsProxy()) {
			InternalEObject oldReceipt_Pnode = (InternalEObject)receipt_Pnode;
			receipt_Pnode = (Pnode)eResolveProxy(oldReceipt_Pnode);
			if (receipt_Pnode != oldReceipt_Pnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE, oldReceipt_Pnode, receipt_Pnode));
			}
		}
		return receipt_Pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode basicGetReceipt_Pnode() {
		return receipt_Pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceipt_Pnode(Pnode newReceipt_Pnode, NotificationChain msgs) {
		Pnode oldReceipt_Pnode = receipt_Pnode;
		receipt_Pnode = newReceipt_Pnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE, oldReceipt_Pnode, newReceipt_Pnode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceipt_Pnode(Pnode newReceipt_Pnode) {
		if (newReceipt_Pnode != receipt_Pnode) {
			NotificationChain msgs = null;
			if (receipt_Pnode != null)
				msgs = ((InternalEObject)receipt_Pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS, Pnode.class, msgs);
			if (newReceipt_Pnode != null)
				msgs = ((InternalEObject)newReceipt_Pnode).eInverseAdd(this, MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS, Pnode.class, msgs);
			msgs = basicSetReceipt_Pnode(newReceipt_Pnode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE, newReceipt_Pnode, newReceipt_Pnode));
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
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyProfiles()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE:
				if (delivery_Pnode != null)
					msgs = ((InternalEObject)delivery_Pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS, Pnode.class, msgs);
				return basicSetDelivery_Pnode((Pnode)otherEnd, msgs);
			case MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE:
				if (receipt_Pnode != null)
					msgs = ((InternalEObject)receipt_Pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS, Pnode.class, msgs);
				return basicSetReceipt_Pnode((Pnode)otherEnd, msgs);
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
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_PROFILES:
				return ((InternalEList<?>)getEnergyProfiles()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE:
				return basicSetDelivery_Pnode(null, msgs);
			case MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE:
				return basicSetReceipt_Pnode(null, msgs);
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
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_TRANS_ID:
				return getEnergyTransId();
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_PROFILES:
				return getEnergyProfiles();
			case MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE:
				if (resolve) return getDelivery_Pnode();
				return basicGetDelivery_Pnode();
			case MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE:
				if (resolve) return getReceipt_Pnode();
				return basicGetReceipt_Pnode();
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
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_TRANS_ID:
				setEnergyTransId((String)newValue);
				return;
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_PROFILES:
				getEnergyProfiles().clear();
				getEnergyProfiles().addAll((Collection<? extends EnergyProfile>)newValue);
				return;
			case MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE:
				setDelivery_Pnode((Pnode)newValue);
				return;
			case MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE:
				setReceipt_Pnode((Pnode)newValue);
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
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_TRANS_ID:
				setEnergyTransId(ENERGY_TRANS_ID_EDEFAULT);
				return;
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_PROFILES:
				getEnergyProfiles().clear();
				return;
			case MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE:
				setDelivery_Pnode((Pnode)null);
				return;
			case MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE:
				setReceipt_Pnode((Pnode)null);
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
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_TRANS_ID:
				return ENERGY_TRANS_ID_EDEFAULT == null ? energyTransId != null : !ENERGY_TRANS_ID_EDEFAULT.equals(energyTransId);
			case MarketOperationsPackage.TRANSACTION_BID__ENERGY_PROFILES:
				return energyProfiles != null && !energyProfiles.isEmpty();
			case MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE:
				return delivery_Pnode != null;
			case MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE:
				return receipt_Pnode != null;
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
		result.append(" (EnergyTransId: ");
		result.append(energyTransId);
		result.append(')');
		return result.toString();
	}

} //TransactionBidImpl
