/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.ConnectivityNode;
import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.FTR;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.TransactionBid;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.Measurement;

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
 * An implementation of the model object '<em><b>Pnode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getReceiptTransactionBids <em>Receipt Transaction Bids</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getRTO <em>RTO</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getRegisteredResources <em>Registered Resources</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getBeginPeriod <em>Begin Period</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getPnodeClearing <em>Pnode Clearing</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getDeliveryTransactionBids <em>Delivery Transaction Bids</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getFTRs <em>FT Rs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getEndPeriod <em>End Period</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.PnodeImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PnodeImpl extends IdentifiedObjectImpl implements Pnode {
	/**
	 * The cached value of the '{@link #getReceiptTransactionBids() <em>Receipt Transaction Bids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptTransactionBids()
	 * @generated
	 * @ordered
	 */
	protected EList<TransactionBid> receiptTransactionBids;

	/**
	 * The cached value of the '{@link #getRTO() <em>RTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTO()
	 * @generated
	 * @ordered
	 */
	protected RTO rto;

	/**
	 * The cached value of the '{@link #getRegisteredResources() <em>Registered Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredResources()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisteredResource> registeredResources;

	/**
	 * The default value of the '{@link #getBeginPeriod() <em>Begin Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Date BEGIN_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginPeriod() <em>Begin Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginPeriod()
	 * @generated
	 * @ordered
	 */
	protected Date beginPeriod = BEGIN_PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPnodeClearing() <em>Pnode Clearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPnodeClearing()
	 * @generated
	 * @ordered
	 */
	protected PnodeClearing pnodeClearing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeliveryTransactionBids() <em>Delivery Transaction Bids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTransactionBids()
	 * @generated
	 * @ordered
	 */
	protected EList<TransactionBid> deliveryTransactionBids;

	/**
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNode()
	 * @generated
	 * @ordered
	 */
	protected ConnectivityNode connectivityNode;

	/**
	 * The cached value of the '{@link #getFTRs() <em>FT Rs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTRs()
	 * @generated
	 * @ordered
	 */
	protected EList<FTR> ftRs;

	/**
	 * The default value of the '{@link #getEndPeriod() <em>End Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPeriod() <em>End Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPeriod()
	 * @generated
	 * @ordered
	 */
	protected Date endPeriod = END_PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PnodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.PNODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactionBid> getReceiptTransactionBids() {
		if (receiptTransactionBids == null) {
			receiptTransactionBids = new EObjectWithInverseResolvingEList<TransactionBid>(TransactionBid.class, this, MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS, MarketOperationsPackage.TRANSACTION_BID__RECEIPT_PNODE);
		}
		return receiptTransactionBids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO getRTO() {
		if (rto != null && rto.eIsProxy()) {
			InternalEObject oldRTO = (InternalEObject)rto;
			rto = (RTO)eResolveProxy(oldRTO);
			if (rto != oldRTO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.PNODE__RTO, oldRTO, rto));
			}
		}
		return rto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO basicGetRTO() {
		return rto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRTO(RTO newRTO, NotificationChain msgs) {
		RTO oldRTO = rto;
		rto = newRTO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__RTO, oldRTO, newRTO);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRTO(RTO newRTO) {
		if (newRTO != rto) {
			NotificationChain msgs = null;
			if (rto != null)
				msgs = ((InternalEObject)rto).eInverseRemove(this, MarketOperationsPackage.RTO__PNODES, RTO.class, msgs);
			if (newRTO != null)
				msgs = ((InternalEObject)newRTO).eInverseAdd(this, MarketOperationsPackage.RTO__PNODES, RTO.class, msgs);
			msgs = basicSetRTO(newRTO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__RTO, newRTO, newRTO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredResource> getRegisteredResources() {
		if (registeredResources == null) {
			registeredResources = new EObjectWithInverseResolvingEList<RegisteredResource>(RegisteredResource.class, this, MarketOperationsPackage.PNODE__REGISTERED_RESOURCES, MarketOperationsPackage.REGISTERED_RESOURCE__PNODE);
		}
		return registeredResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBeginPeriod() {
		return beginPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginPeriod(Date newBeginPeriod) {
		Date oldBeginPeriod = beginPeriod;
		beginPeriod = newBeginPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__BEGIN_PERIOD, oldBeginPeriod, beginPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PnodeClearing getPnodeClearing() {
		if (pnodeClearing != null && pnodeClearing.eIsProxy()) {
			InternalEObject oldPnodeClearing = (InternalEObject)pnodeClearing;
			pnodeClearing = (PnodeClearing)eResolveProxy(oldPnodeClearing);
			if (pnodeClearing != oldPnodeClearing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.PNODE__PNODE_CLEARING, oldPnodeClearing, pnodeClearing));
			}
		}
		return pnodeClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PnodeClearing basicGetPnodeClearing() {
		return pnodeClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPnodeClearing(PnodeClearing newPnodeClearing, NotificationChain msgs) {
		PnodeClearing oldPnodeClearing = pnodeClearing;
		pnodeClearing = newPnodeClearing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__PNODE_CLEARING, oldPnodeClearing, newPnodeClearing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPnodeClearing(PnodeClearing newPnodeClearing) {
		if (newPnodeClearing != pnodeClearing) {
			NotificationChain msgs = null;
			if (pnodeClearing != null)
				msgs = ((InternalEObject)pnodeClearing).eInverseRemove(this, MarketOperationsPackage.PNODE_CLEARING__PNODE, PnodeClearing.class, msgs);
			if (newPnodeClearing != null)
				msgs = ((InternalEObject)newPnodeClearing).eInverseAdd(this, MarketOperationsPackage.PNODE_CLEARING__PNODE, PnodeClearing.class, msgs);
			msgs = basicSetPnodeClearing(newPnodeClearing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__PNODE_CLEARING, newPnodeClearing, newPnodeClearing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactionBid> getDeliveryTransactionBids() {
		if (deliveryTransactionBids == null) {
			deliveryTransactionBids = new EObjectWithInverseResolvingEList<TransactionBid>(TransactionBid.class, this, MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS, MarketOperationsPackage.TRANSACTION_BID__DELIVERY_PNODE);
		}
		return deliveryTransactionBids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode getConnectivityNode() {
		if (connectivityNode != null && connectivityNode.eIsProxy()) {
			InternalEObject oldConnectivityNode = (InternalEObject)connectivityNode;
			connectivityNode = (ConnectivityNode)eResolveProxy(oldConnectivityNode);
			if (connectivityNode != oldConnectivityNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.PNODE__CONNECTIVITY_NODE, oldConnectivityNode, connectivityNode));
			}
		}
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode basicGetConnectivityNode() {
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectivityNode(ConnectivityNode newConnectivityNode, NotificationChain msgs) {
		ConnectivityNode oldConnectivityNode = connectivityNode;
		connectivityNode = newConnectivityNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__CONNECTIVITY_NODE, oldConnectivityNode, newConnectivityNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivityNode(ConnectivityNode newConnectivityNode) {
		if (newConnectivityNode != connectivityNode) {
			NotificationChain msgs = null;
			if (connectivityNode != null)
				msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE__PNODE, ConnectivityNode.class, msgs);
			if (newConnectivityNode != null)
				msgs = ((InternalEObject)newConnectivityNode).eInverseAdd(this, CorePackage.CONNECTIVITY_NODE__PNODE, ConnectivityNode.class, msgs);
			msgs = basicSetConnectivityNode(newConnectivityNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__CONNECTIVITY_NODE, newConnectivityNode, newConnectivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FTR> getFTRs() {
		if (ftRs == null) {
			ftRs = new EObjectWithInverseResolvingEList.ManyInverse<FTR>(FTR.class, this, MarketOperationsPackage.PNODE__FT_RS, MarketOperationsPackage.FTR__PNODES);
		}
		return ftRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndPeriod() {
		return endPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPeriod(Date newEndPeriod) {
		Date oldEndPeriod = endPeriod;
		endPeriod = newEndPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__END_PERIOD, oldEndPeriod, endPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, MarketOperationsPackage.PNODE__MEASUREMENTS, MeasPackage.MEASUREMENT__PNODE);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(String newUsage) {
		String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE__USAGE, oldUsage, usage));
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
			case MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiptTransactionBids()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.PNODE__RTO:
				if (rto != null)
					msgs = ((InternalEObject)rto).eInverseRemove(this, MarketOperationsPackage.RTO__PNODES, RTO.class, msgs);
				return basicSetRTO((RTO)otherEnd, msgs);
			case MarketOperationsPackage.PNODE__REGISTERED_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegisteredResources()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.PNODE__PNODE_CLEARING:
				if (pnodeClearing != null)
					msgs = ((InternalEObject)pnodeClearing).eInverseRemove(this, MarketOperationsPackage.PNODE_CLEARING__PNODE, PnodeClearing.class, msgs);
				return basicSetPnodeClearing((PnodeClearing)otherEnd, msgs);
			case MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeliveryTransactionBids()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.PNODE__CONNECTIVITY_NODE:
				if (connectivityNode != null)
					msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE__PNODE, ConnectivityNode.class, msgs);
				return basicSetConnectivityNode((ConnectivityNode)otherEnd, msgs);
			case MarketOperationsPackage.PNODE__FT_RS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFTRs()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.PNODE__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS:
				return ((InternalEList<?>)getReceiptTransactionBids()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.PNODE__RTO:
				return basicSetRTO(null, msgs);
			case MarketOperationsPackage.PNODE__REGISTERED_RESOURCES:
				return ((InternalEList<?>)getRegisteredResources()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.PNODE__PNODE_CLEARING:
				return basicSetPnodeClearing(null, msgs);
			case MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS:
				return ((InternalEList<?>)getDeliveryTransactionBids()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.PNODE__CONNECTIVITY_NODE:
				return basicSetConnectivityNode(null, msgs);
			case MarketOperationsPackage.PNODE__FT_RS:
				return ((InternalEList<?>)getFTRs()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.PNODE__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS:
				return getReceiptTransactionBids();
			case MarketOperationsPackage.PNODE__RTO:
				if (resolve) return getRTO();
				return basicGetRTO();
			case MarketOperationsPackage.PNODE__REGISTERED_RESOURCES:
				return getRegisteredResources();
			case MarketOperationsPackage.PNODE__BEGIN_PERIOD:
				return getBeginPeriod();
			case MarketOperationsPackage.PNODE__PNODE_CLEARING:
				if (resolve) return getPnodeClearing();
				return basicGetPnodeClearing();
			case MarketOperationsPackage.PNODE__TYPE:
				return getType();
			case MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS:
				return getDeliveryTransactionBids();
			case MarketOperationsPackage.PNODE__IS_PUBLIC:
				return isIsPublic();
			case MarketOperationsPackage.PNODE__CONNECTIVITY_NODE:
				if (resolve) return getConnectivityNode();
				return basicGetConnectivityNode();
			case MarketOperationsPackage.PNODE__FT_RS:
				return getFTRs();
			case MarketOperationsPackage.PNODE__END_PERIOD:
				return getEndPeriod();
			case MarketOperationsPackage.PNODE__MEASUREMENTS:
				return getMeasurements();
			case MarketOperationsPackage.PNODE__USAGE:
				return getUsage();
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
			case MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS:
				getReceiptTransactionBids().clear();
				getReceiptTransactionBids().addAll((Collection<? extends TransactionBid>)newValue);
				return;
			case MarketOperationsPackage.PNODE__RTO:
				setRTO((RTO)newValue);
				return;
			case MarketOperationsPackage.PNODE__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
				getRegisteredResources().addAll((Collection<? extends RegisteredResource>)newValue);
				return;
			case MarketOperationsPackage.PNODE__BEGIN_PERIOD:
				setBeginPeriod((Date)newValue);
				return;
			case MarketOperationsPackage.PNODE__PNODE_CLEARING:
				setPnodeClearing((PnodeClearing)newValue);
				return;
			case MarketOperationsPackage.PNODE__TYPE:
				setType((String)newValue);
				return;
			case MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS:
				getDeliveryTransactionBids().clear();
				getDeliveryTransactionBids().addAll((Collection<? extends TransactionBid>)newValue);
				return;
			case MarketOperationsPackage.PNODE__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case MarketOperationsPackage.PNODE__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)newValue);
				return;
			case MarketOperationsPackage.PNODE__FT_RS:
				getFTRs().clear();
				getFTRs().addAll((Collection<? extends FTR>)newValue);
				return;
			case MarketOperationsPackage.PNODE__END_PERIOD:
				setEndPeriod((Date)newValue);
				return;
			case MarketOperationsPackage.PNODE__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case MarketOperationsPackage.PNODE__USAGE:
				setUsage((String)newValue);
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
			case MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS:
				getReceiptTransactionBids().clear();
				return;
			case MarketOperationsPackage.PNODE__RTO:
				setRTO((RTO)null);
				return;
			case MarketOperationsPackage.PNODE__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
				return;
			case MarketOperationsPackage.PNODE__BEGIN_PERIOD:
				setBeginPeriod(BEGIN_PERIOD_EDEFAULT);
				return;
			case MarketOperationsPackage.PNODE__PNODE_CLEARING:
				setPnodeClearing((PnodeClearing)null);
				return;
			case MarketOperationsPackage.PNODE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS:
				getDeliveryTransactionBids().clear();
				return;
			case MarketOperationsPackage.PNODE__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case MarketOperationsPackage.PNODE__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)null);
				return;
			case MarketOperationsPackage.PNODE__FT_RS:
				getFTRs().clear();
				return;
			case MarketOperationsPackage.PNODE__END_PERIOD:
				setEndPeriod(END_PERIOD_EDEFAULT);
				return;
			case MarketOperationsPackage.PNODE__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case MarketOperationsPackage.PNODE__USAGE:
				setUsage(USAGE_EDEFAULT);
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
			case MarketOperationsPackage.PNODE__RECEIPT_TRANSACTION_BIDS:
				return receiptTransactionBids != null && !receiptTransactionBids.isEmpty();
			case MarketOperationsPackage.PNODE__RTO:
				return rto != null;
			case MarketOperationsPackage.PNODE__REGISTERED_RESOURCES:
				return registeredResources != null && !registeredResources.isEmpty();
			case MarketOperationsPackage.PNODE__BEGIN_PERIOD:
				return BEGIN_PERIOD_EDEFAULT == null ? beginPeriod != null : !BEGIN_PERIOD_EDEFAULT.equals(beginPeriod);
			case MarketOperationsPackage.PNODE__PNODE_CLEARING:
				return pnodeClearing != null;
			case MarketOperationsPackage.PNODE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MarketOperationsPackage.PNODE__DELIVERY_TRANSACTION_BIDS:
				return deliveryTransactionBids != null && !deliveryTransactionBids.isEmpty();
			case MarketOperationsPackage.PNODE__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
			case MarketOperationsPackage.PNODE__CONNECTIVITY_NODE:
				return connectivityNode != null;
			case MarketOperationsPackage.PNODE__FT_RS:
				return ftRs != null && !ftRs.isEmpty();
			case MarketOperationsPackage.PNODE__END_PERIOD:
				return END_PERIOD_EDEFAULT == null ? endPeriod != null : !END_PERIOD_EDEFAULT.equals(endPeriod);
			case MarketOperationsPackage.PNODE__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case MarketOperationsPackage.PNODE__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
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
		result.append(" (beginPeriod: ");
		result.append(beginPeriod);
		result.append(", type: ");
		result.append(type);
		result.append(", isPublic: ");
		result.append(isPublic);
		result.append(", endPeriod: ");
		result.append(endPeriod);
		result.append(", usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //PnodeImpl
