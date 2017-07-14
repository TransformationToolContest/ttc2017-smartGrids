/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad;

import gluemodel.CIM.IEC61970.LoadModel.LoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;

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
 * An implementation of the model object '<em><b>Registered Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredLoadImpl#getLoadArea <em>Load Area</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.RegisteredLoadImpl#getLoadBids <em>Load Bids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisteredLoadImpl extends RegisteredResourceImpl implements RegisteredLoad {
	/**
	 * The cached value of the '{@link #getLoadArea() <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadArea()
	 * @generated
	 * @ordered
	 */
	protected LoadGroup loadArea;

	/**
	 * The cached value of the '{@link #getLoadBids() <em>Load Bids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBids()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadBid> loadBids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredLoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.REGISTERED_LOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadGroup getLoadArea() {
		if (loadArea != null && loadArea.eIsProxy()) {
			InternalEObject oldLoadArea = (InternalEObject)loadArea;
			loadArea = (LoadGroup)eResolveProxy(oldLoadArea);
			if (loadArea != oldLoadArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA, oldLoadArea, loadArea));
			}
		}
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadGroup basicGetLoadArea() {
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadArea(LoadGroup newLoadArea, NotificationChain msgs) {
		LoadGroup oldLoadArea = loadArea;
		loadArea = newLoadArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA, oldLoadArea, newLoadArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadArea(LoadGroup newLoadArea) {
		if (newLoadArea != loadArea) {
			NotificationChain msgs = null;
			if (loadArea != null)
				msgs = ((InternalEObject)loadArea).eInverseRemove(this, LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS, LoadGroup.class, msgs);
			if (newLoadArea != null)
				msgs = ((InternalEObject)newLoadArea).eInverseAdd(this, LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS, LoadGroup.class, msgs);
			msgs = basicSetLoadArea(newLoadArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA, newLoadArea, newLoadArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBid> getLoadBids() {
		if (loadBids == null) {
			loadBids = new EObjectWithInverseResolvingEList<LoadBid>(LoadBid.class, this, MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS, MarketOperationsPackage.LOAD_BID__REGISTERED_LOAD);
		}
		return loadBids;
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
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA:
				if (loadArea != null)
					msgs = ((InternalEObject)loadArea).eInverseRemove(this, LoadModelPackage.LOAD_GROUP__REGISTERED_LOADS, LoadGroup.class, msgs);
				return basicSetLoadArea((LoadGroup)otherEnd, msgs);
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadBids()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA:
				return basicSetLoadArea(null, msgs);
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS:
				return ((InternalEList<?>)getLoadBids()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA:
				if (resolve) return getLoadArea();
				return basicGetLoadArea();
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS:
				return getLoadBids();
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
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA:
				setLoadArea((LoadGroup)newValue);
				return;
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS:
				getLoadBids().clear();
				getLoadBids().addAll((Collection<? extends LoadBid>)newValue);
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
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA:
				setLoadArea((LoadGroup)null);
				return;
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS:
				getLoadBids().clear();
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
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_AREA:
				return loadArea != null;
			case MarketOperationsPackage.REGISTERED_LOAD__LOAD_BIDS:
				return loadBids != null && !loadBids.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegisteredLoadImpl
