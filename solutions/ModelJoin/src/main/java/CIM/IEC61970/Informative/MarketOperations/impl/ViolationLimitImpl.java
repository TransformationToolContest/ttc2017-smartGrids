/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.MarketOperations.Flowgate;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.ViolationLimit;

import CIM.IEC61970.LoadModel.LoadModelPackage;
import CIM.IEC61970.LoadModel.Season;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.Measurement;

import CIM.IEC61970.Meas.impl.LimitImpl;

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
 * An implementation of the model object '<em><b>Violation Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ViolationLimitImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ViolationLimitImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ViolationLimitImpl#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ViolationLimitImpl#getFlowgate <em>Flowgate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ViolationLimitImpl#isEnforced <em>Enforced</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViolationLimitImpl extends LimitImpl implements ViolationLimit {
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
	 * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement()
	 * @generated
	 * @ordered
	 */
	protected Measurement measurement;

	/**
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpOrganisation> organisations;

	/**
	 * The cached value of the '{@link #getFlowgate() <em>Flowgate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowgate()
	 * @generated
	 * @ordered
	 */
	protected Flowgate flowgate;

	/**
	 * The default value of the '{@link #isEnforced() <em>Enforced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnforced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENFORCED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnforced() <em>Enforced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnforced()
	 * @generated
	 * @ordered
	 */
	protected boolean enforced = ENFORCED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViolationLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.VIOLATION_LIMIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.VIOLATION_LIMIT__SEASON, oldSeason, season));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.VIOLATION_LIMIT__SEASON, oldSeason, newSeason);
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
				msgs = ((InternalEObject)season).eInverseRemove(this, LoadModelPackage.SEASON__VIOLATION_LIMITS, Season.class, msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, LoadModelPackage.SEASON__VIOLATION_LIMITS, Season.class, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.VIOLATION_LIMIT__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getMeasurement() {
		if (measurement != null && measurement.eIsProxy()) {
			InternalEObject oldMeasurement = (InternalEObject)measurement;
			measurement = (Measurement)eResolveProxy(oldMeasurement);
			if (measurement != oldMeasurement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT, oldMeasurement, measurement));
			}
		}
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement basicGetMeasurement() {
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurement(Measurement newMeasurement, NotificationChain msgs) {
		Measurement oldMeasurement = measurement;
		measurement = newMeasurement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT, oldMeasurement, newMeasurement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurement(Measurement newMeasurement) {
		if (newMeasurement != measurement) {
			NotificationChain msgs = null;
			if (measurement != null)
				msgs = ((InternalEObject)measurement).eInverseRemove(this, MeasPackage.MEASUREMENT__VIOLATION_LIMITS, Measurement.class, msgs);
			if (newMeasurement != null)
				msgs = ((InternalEObject)newMeasurement).eInverseAdd(this, MeasPackage.MEASUREMENT__VIOLATION_LIMITS, Measurement.class, msgs);
			msgs = basicSetMeasurement(newMeasurement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT, newMeasurement, newMeasurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpOrganisation> getOrganisations() {
		if (organisations == null) {
			organisations = new EObjectWithInverseResolvingEList.ManyInverse<ErpOrganisation>(ErpOrganisation.class, this, MarketOperationsPackage.VIOLATION_LIMIT__ORGANISATIONS, InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS);
		}
		return organisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flowgate getFlowgate() {
		if (flowgate != null && flowgate.eIsProxy()) {
			InternalEObject oldFlowgate = (InternalEObject)flowgate;
			flowgate = (Flowgate)eResolveProxy(oldFlowgate);
			if (flowgate != oldFlowgate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE, oldFlowgate, flowgate));
			}
		}
		return flowgate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flowgate basicGetFlowgate() {
		return flowgate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowgate(Flowgate newFlowgate, NotificationChain msgs) {
		Flowgate oldFlowgate = flowgate;
		flowgate = newFlowgate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE, oldFlowgate, newFlowgate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowgate(Flowgate newFlowgate) {
		if (newFlowgate != flowgate) {
			NotificationChain msgs = null;
			if (flowgate != null)
				msgs = ((InternalEObject)flowgate).eInverseRemove(this, MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS, Flowgate.class, msgs);
			if (newFlowgate != null)
				msgs = ((InternalEObject)newFlowgate).eInverseAdd(this, MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS, Flowgate.class, msgs);
			msgs = basicSetFlowgate(newFlowgate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE, newFlowgate, newFlowgate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnforced() {
		return enforced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnforced(boolean newEnforced) {
		boolean oldEnforced = enforced;
		enforced = newEnforced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.VIOLATION_LIMIT__ENFORCED, oldEnforced, enforced));
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
			case MarketOperationsPackage.VIOLATION_LIMIT__SEASON:
				if (season != null)
					msgs = ((InternalEObject)season).eInverseRemove(this, LoadModelPackage.SEASON__VIOLATION_LIMITS, Season.class, msgs);
				return basicSetSeason((Season)otherEnd, msgs);
			case MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT:
				if (measurement != null)
					msgs = ((InternalEObject)measurement).eInverseRemove(this, MeasPackage.MEASUREMENT__VIOLATION_LIMITS, Measurement.class, msgs);
				return basicSetMeasurement((Measurement)otherEnd, msgs);
			case MarketOperationsPackage.VIOLATION_LIMIT__ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganisations()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE:
				if (flowgate != null)
					msgs = ((InternalEObject)flowgate).eInverseRemove(this, MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS, Flowgate.class, msgs);
				return basicSetFlowgate((Flowgate)otherEnd, msgs);
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
			case MarketOperationsPackage.VIOLATION_LIMIT__SEASON:
				return basicSetSeason(null, msgs);
			case MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT:
				return basicSetMeasurement(null, msgs);
			case MarketOperationsPackage.VIOLATION_LIMIT__ORGANISATIONS:
				return ((InternalEList<?>)getOrganisations()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE:
				return basicSetFlowgate(null, msgs);
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
			case MarketOperationsPackage.VIOLATION_LIMIT__SEASON:
				if (resolve) return getSeason();
				return basicGetSeason();
			case MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT:
				if (resolve) return getMeasurement();
				return basicGetMeasurement();
			case MarketOperationsPackage.VIOLATION_LIMIT__ORGANISATIONS:
				return getOrganisations();
			case MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE:
				if (resolve) return getFlowgate();
				return basicGetFlowgate();
			case MarketOperationsPackage.VIOLATION_LIMIT__ENFORCED:
				return isEnforced();
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
			case MarketOperationsPackage.VIOLATION_LIMIT__SEASON:
				setSeason((Season)newValue);
				return;
			case MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT:
				setMeasurement((Measurement)newValue);
				return;
			case MarketOperationsPackage.VIOLATION_LIMIT__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends ErpOrganisation>)newValue);
				return;
			case MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE:
				setFlowgate((Flowgate)newValue);
				return;
			case MarketOperationsPackage.VIOLATION_LIMIT__ENFORCED:
				setEnforced((Boolean)newValue);
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
			case MarketOperationsPackage.VIOLATION_LIMIT__SEASON:
				setSeason((Season)null);
				return;
			case MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT:
				setMeasurement((Measurement)null);
				return;
			case MarketOperationsPackage.VIOLATION_LIMIT__ORGANISATIONS:
				getOrganisations().clear();
				return;
			case MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE:
				setFlowgate((Flowgate)null);
				return;
			case MarketOperationsPackage.VIOLATION_LIMIT__ENFORCED:
				setEnforced(ENFORCED_EDEFAULT);
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
			case MarketOperationsPackage.VIOLATION_LIMIT__SEASON:
				return season != null;
			case MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT:
				return measurement != null;
			case MarketOperationsPackage.VIOLATION_LIMIT__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
			case MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE:
				return flowgate != null;
			case MarketOperationsPackage.VIOLATION_LIMIT__ENFORCED:
				return enforced != ENFORCED_EDEFAULT;
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
		result.append(" (enforced: ");
		result.append(enforced);
		result.append(')');
		return result.toString();
	}

} //ViolationLimitImpl
