/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;
import gluemodel.CIM.IEC61970.LoadModel.Season;

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
 * An implementation of the model object '<em><b>Capacity Benefit Margin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.CapacityBenefitMarginImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.CapacityBenefitMarginImpl#getFlowgate <em>Flowgate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapacityBenefitMarginImpl extends ProfileImpl implements CapacityBenefitMargin {
	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected Season season;

	/**
	 * The cached value of the '{@link #getFlowgate() <em>Flowgate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowgate()
	 * @generated
	 * @ordered
	 */
	protected EList<Flowgate> flowgate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityBenefitMarginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.CAPACITY_BENEFIT_MARGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season getSeason() {
		if (season != null && season.eIsProxy()) {
			InternalEObject oldSeason = (InternalEObject)season;
			season = (Season)eResolveProxy(oldSeason);
			if (season != oldSeason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON, oldSeason, season));
			}
		}
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season basicGetSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(Season newSeason, NotificationChain msgs) {
		Season oldSeason = season;
		season = newSeason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON, oldSeason, newSeason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(Season newSeason) {
		if (newSeason != season) {
			NotificationChain msgs = null;
			if (season != null)
				msgs = ((InternalEObject)season).eInverseRemove(this, LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN, Season.class, msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN, Season.class, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flowgate> getFlowgate() {
		if (flowgate == null) {
			flowgate = new EObjectWithInverseResolvingEList.ManyInverse<Flowgate>(Flowgate.class, this, MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__FLOWGATE, MarketOperationsPackage.FLOWGATE__CAPACITY_BENEFIT_MARGIN);
		}
		return flowgate;
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
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON:
				if (season != null)
					msgs = ((InternalEObject)season).eInverseRemove(this, LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN, Season.class, msgs);
				return basicSetSeason((Season)otherEnd, msgs);
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__FLOWGATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowgate()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON:
				return basicSetSeason(null, msgs);
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__FLOWGATE:
				return ((InternalEList<?>)getFlowgate()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON:
				if (resolve) return getSeason();
				return basicGetSeason();
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__FLOWGATE:
				return getFlowgate();
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
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON:
				setSeason((Season)newValue);
				return;
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__FLOWGATE:
				getFlowgate().clear();
				getFlowgate().addAll((Collection<? extends Flowgate>)newValue);
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
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON:
				setSeason((Season)null);
				return;
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__FLOWGATE:
				getFlowgate().clear();
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
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON:
				return season != null;
			case MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__FLOWGATE:
				return flowgate != null && !flowgate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapacityBenefitMarginImpl
