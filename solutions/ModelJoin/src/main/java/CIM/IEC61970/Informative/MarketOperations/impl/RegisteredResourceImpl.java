/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.MarketOperations.Market;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.MarketProduct;
import CIM.IEC61970.Informative.MarketOperations.Meter;
import CIM.IEC61970.Informative.MarketOperations.Pnode;
import CIM.IEC61970.Informative.MarketOperations.RegisteredResource;
import CIM.IEC61970.Informative.MarketOperations.ResourceGroup;

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
 * An implementation of the model object '<em><b>Registered Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl#getMarkets <em>Markets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl#getMarketProducts <em>Market Products</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl#getRtoID <em>Rto ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl#getMeters <em>Meters</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl#getPnode <em>Pnode</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.RegisteredResourceImpl#getResourceGroups <em>Resource Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisteredResourceImpl extends IdentifiedObjectImpl implements RegisteredResource {
	/**
	 * The cached value of the '{@link #getMarkets() <em>Markets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkets()
	 * @generated
	 * @ordered
	 */
	protected EList<Market> markets;

	/**
	 * The cached value of the '{@link #getMarketProducts() <em>Market Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketProduct> marketProducts;

	/**
	 * The default value of the '{@link #getRtoID() <em>Rto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtoID()
	 * @generated
	 * @ordered
	 */
	protected static final String RTO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRtoID() <em>Rto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtoID()
	 * @generated
	 * @ordered
	 */
	protected String rtoID = RTO_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeters() <em>Meters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<Meter> meters;

	/**
	 * The cached value of the '{@link #getPnode() <em>Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPnode()
	 * @generated
	 * @ordered
	 */
	protected Pnode pnode;

	/**
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation organisation;

	/**
	 * The cached value of the '{@link #getResourceGroups() <em>Resource Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceGroup> resourceGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.REGISTERED_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Market> getMarkets() {
		if (markets == null) {
			markets = new EObjectWithInverseResolvingEList.ManyInverse<Market>(Market.class, this, MarketOperationsPackage.REGISTERED_RESOURCE__MARKETS, MarketOperationsPackage.MARKET__REGISTERED_RESOURCES);
		}
		return markets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketProduct> getMarketProducts() {
		if (marketProducts == null) {
			marketProducts = new EObjectWithInverseResolvingEList.ManyInverse<MarketProduct>(MarketProduct.class, this, MarketOperationsPackage.REGISTERED_RESOURCE__MARKET_PRODUCTS, MarketOperationsPackage.MARKET_PRODUCT__REGISTERED_RESOURCES);
		}
		return marketProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRtoID() {
		return rtoID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtoID(String newRtoID) {
		String oldRtoID = rtoID;
		rtoID = newRtoID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_RESOURCE__RTO_ID, oldRtoID, rtoID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meter> getMeters() {
		if (meters == null) {
			meters = new EObjectWithInverseResolvingEList<Meter>(Meter.class, this, MarketOperationsPackage.REGISTERED_RESOURCE__METERS, MarketOperationsPackage.METER__REGISTERED_RESOURCE);
		}
		return meters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode getPnode() {
		if (pnode != null && pnode.eIsProxy()) {
			InternalEObject oldPnode = (InternalEObject)pnode;
			pnode = (Pnode)eResolveProxy(oldPnode);
			if (pnode != oldPnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.REGISTERED_RESOURCE__PNODE, oldPnode, pnode));
			}
		}
		return pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode basicGetPnode() {
		return pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPnode(Pnode newPnode, NotificationChain msgs) {
		Pnode oldPnode = pnode;
		pnode = newPnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_RESOURCE__PNODE, oldPnode, newPnode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPnode(Pnode newPnode) {
		if (newPnode != pnode) {
			NotificationChain msgs = null;
			if (pnode != null)
				msgs = ((InternalEObject)pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__REGISTERED_RESOURCES, Pnode.class, msgs);
			if (newPnode != null)
				msgs = ((InternalEObject)newPnode).eInverseAdd(this, MarketOperationsPackage.PNODE__REGISTERED_RESOURCES, Pnode.class, msgs);
			msgs = basicSetPnode(newPnode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_RESOURCE__PNODE, newPnode, newPnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation getOrganisation() {
		if (organisation != null && organisation.eIsProxy()) {
			InternalEObject oldOrganisation = (InternalEObject)organisation;
			organisation = (ErpOrganisation)eResolveProxy(oldOrganisation);
			if (organisation != oldOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION, oldOrganisation, organisation));
			}
		}
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetOrganisation() {
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisation(ErpOrganisation newOrganisation, NotificationChain msgs) {
		ErpOrganisation oldOrganisation = organisation;
		organisation = newOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION, oldOrganisation, newOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisation(ErpOrganisation newOrganisation) {
		if (newOrganisation != organisation) {
			NotificationChain msgs = null;
			if (organisation != null)
				msgs = ((InternalEObject)organisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES, ErpOrganisation.class, msgs);
			if (newOrganisation != null)
				msgs = ((InternalEObject)newOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES, ErpOrganisation.class, msgs);
			msgs = basicSetOrganisation(newOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION, newOrganisation, newOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceGroup> getResourceGroups() {
		if (resourceGroups == null) {
			resourceGroups = new EObjectWithInverseResolvingEList.ManyInverse<ResourceGroup>(ResourceGroup.class, this, MarketOperationsPackage.REGISTERED_RESOURCE__RESOURCE_GROUPS, MarketOperationsPackage.RESOURCE_GROUP__REGISTERED_RESOURCES);
		}
		return resourceGroups;
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
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarkets()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKET_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarketProducts()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__METERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeters()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__PNODE:
				if (pnode != null)
					msgs = ((InternalEObject)pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__REGISTERED_RESOURCES, Pnode.class, msgs);
				return basicSetPnode((Pnode)otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION:
				if (organisation != null)
					msgs = ((InternalEObject)organisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES, ErpOrganisation.class, msgs);
				return basicSetOrganisation((ErpOrganisation)otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__RESOURCE_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceGroups()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKETS:
				return ((InternalEList<?>)getMarkets()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKET_PRODUCTS:
				return ((InternalEList<?>)getMarketProducts()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__METERS:
				return ((InternalEList<?>)getMeters()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__PNODE:
				return basicSetPnode(null, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION:
				return basicSetOrganisation(null, msgs);
			case MarketOperationsPackage.REGISTERED_RESOURCE__RESOURCE_GROUPS:
				return ((InternalEList<?>)getResourceGroups()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKETS:
				return getMarkets();
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKET_PRODUCTS:
				return getMarketProducts();
			case MarketOperationsPackage.REGISTERED_RESOURCE__RTO_ID:
				return getRtoID();
			case MarketOperationsPackage.REGISTERED_RESOURCE__METERS:
				return getMeters();
			case MarketOperationsPackage.REGISTERED_RESOURCE__PNODE:
				if (resolve) return getPnode();
				return basicGetPnode();
			case MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION:
				if (resolve) return getOrganisation();
				return basicGetOrganisation();
			case MarketOperationsPackage.REGISTERED_RESOURCE__RESOURCE_GROUPS:
				return getResourceGroups();
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
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKETS:
				getMarkets().clear();
				getMarkets().addAll((Collection<? extends Market>)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKET_PRODUCTS:
				getMarketProducts().clear();
				getMarketProducts().addAll((Collection<? extends MarketProduct>)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__RTO_ID:
				setRtoID((String)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__METERS:
				getMeters().clear();
				getMeters().addAll((Collection<? extends Meter>)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__PNODE:
				setPnode((Pnode)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION:
				setOrganisation((ErpOrganisation)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__RESOURCE_GROUPS:
				getResourceGroups().clear();
				getResourceGroups().addAll((Collection<? extends ResourceGroup>)newValue);
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
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKETS:
				getMarkets().clear();
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKET_PRODUCTS:
				getMarketProducts().clear();
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__RTO_ID:
				setRtoID(RTO_ID_EDEFAULT);
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__METERS:
				getMeters().clear();
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__PNODE:
				setPnode((Pnode)null);
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION:
				setOrganisation((ErpOrganisation)null);
				return;
			case MarketOperationsPackage.REGISTERED_RESOURCE__RESOURCE_GROUPS:
				getResourceGroups().clear();
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
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKETS:
				return markets != null && !markets.isEmpty();
			case MarketOperationsPackage.REGISTERED_RESOURCE__MARKET_PRODUCTS:
				return marketProducts != null && !marketProducts.isEmpty();
			case MarketOperationsPackage.REGISTERED_RESOURCE__RTO_ID:
				return RTO_ID_EDEFAULT == null ? rtoID != null : !RTO_ID_EDEFAULT.equals(rtoID);
			case MarketOperationsPackage.REGISTERED_RESOURCE__METERS:
				return meters != null && !meters.isEmpty();
			case MarketOperationsPackage.REGISTERED_RESOURCE__PNODE:
				return pnode != null;
			case MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION:
				return organisation != null;
			case MarketOperationsPackage.REGISTERED_RESOURCE__RESOURCE_GROUPS:
				return resourceGroups != null && !resourceGroups.isEmpty();
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
		result.append(" (rtoID: ");
		result.append(rtoID);
		result.append(')');
		return result.toString();
	}

} //RegisteredResourceImpl
