/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.Generation.Production.CogenerationPlant;
import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.SteamSendoutSchedule;
import CIM.IEC61970.Generation.Production.ThermalGeneratingUnit;

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
 * An implementation of the model object '<em><b>Cogeneration Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.CogenerationPlantImpl#getRatedP <em>Rated P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CogenerationPlantImpl extends PowerSystemResourceImpl implements CogenerationPlant {
	/**
	 * The default value of the '{@link #getCogenLPSteamRating() <em>Cogen LP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenLPSteamRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COGEN_LP_STEAM_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCogenLPSteamRating() <em>Cogen LP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenLPSteamRating()
	 * @generated
	 * @ordered
	 */
	protected float cogenLPSteamRating = COGEN_LP_STEAM_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCogenHPSteamRating() <em>Cogen HP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenHPSteamRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COGEN_HP_STEAM_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCogenHPSteamRating() <em>Cogen HP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenHPSteamRating()
	 * @generated
	 * @ordered
	 */
	protected float cogenHPSteamRating = COGEN_HP_STEAM_RATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteamSendoutSchedule() <em>Steam Sendout Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSendoutSchedule()
	 * @generated
	 * @ordered
	 */
	protected SteamSendoutSchedule steamSendoutSchedule;

	/**
	 * The default value of the '{@link #getCogenHPSendoutRating() <em>Cogen HP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenHPSendoutRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COGEN_HP_SENDOUT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCogenHPSendoutRating() <em>Cogen HP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenHPSendoutRating()
	 * @generated
	 * @ordered
	 */
	protected float cogenHPSendoutRating = COGEN_HP_SENDOUT_RATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnits() <em>Thermal Generating Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ThermalGeneratingUnit> thermalGeneratingUnits;

	/**
	 * The default value of the '{@link #getCogenLPSendoutRating() <em>Cogen LP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenLPSendoutRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COGEN_LP_SENDOUT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCogenLPSendoutRating() <em>Cogen LP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenLPSendoutRating()
	 * @generated
	 * @ordered
	 */
	protected float cogenLPSendoutRating = COGEN_LP_SENDOUT_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedP() <em>Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedP() <em>Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedP()
	 * @generated
	 * @ordered
	 */
	protected float ratedP = RATED_P_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CogenerationPlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.COGENERATION_PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCogenLPSteamRating() {
		return cogenLPSteamRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCogenLPSteamRating(float newCogenLPSteamRating) {
		float oldCogenLPSteamRating = cogenLPSteamRating;
		cogenLPSteamRating = newCogenLPSteamRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING, oldCogenLPSteamRating, cogenLPSteamRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCogenHPSteamRating() {
		return cogenHPSteamRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCogenHPSteamRating(float newCogenHPSteamRating) {
		float oldCogenHPSteamRating = cogenHPSteamRating;
		cogenHPSteamRating = newCogenHPSteamRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING, oldCogenHPSteamRating, cogenHPSteamRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteamSendoutSchedule getSteamSendoutSchedule() {
		if (steamSendoutSchedule != null && steamSendoutSchedule.eIsProxy()) {
			InternalEObject oldSteamSendoutSchedule = (InternalEObject)steamSendoutSchedule;
			steamSendoutSchedule = (SteamSendoutSchedule)eResolveProxy(oldSteamSendoutSchedule);
			if (steamSendoutSchedule != oldSteamSendoutSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, oldSteamSendoutSchedule, steamSendoutSchedule));
			}
		}
		return steamSendoutSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteamSendoutSchedule basicGetSteamSendoutSchedule() {
		return steamSendoutSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteamSendoutSchedule(SteamSendoutSchedule newSteamSendoutSchedule, NotificationChain msgs) {
		SteamSendoutSchedule oldSteamSendoutSchedule = steamSendoutSchedule;
		steamSendoutSchedule = newSteamSendoutSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, oldSteamSendoutSchedule, newSteamSendoutSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteamSendoutSchedule(SteamSendoutSchedule newSteamSendoutSchedule) {
		if (newSteamSendoutSchedule != steamSendoutSchedule) {
			NotificationChain msgs = null;
			if (steamSendoutSchedule != null)
				msgs = ((InternalEObject)steamSendoutSchedule).eInverseRemove(this, ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs);
			if (newSteamSendoutSchedule != null)
				msgs = ((InternalEObject)newSteamSendoutSchedule).eInverseAdd(this, ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs);
			msgs = basicSetSteamSendoutSchedule(newSteamSendoutSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, newSteamSendoutSchedule, newSteamSendoutSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCogenHPSendoutRating() {
		return cogenHPSendoutRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCogenHPSendoutRating(float newCogenHPSendoutRating) {
		float oldCogenHPSendoutRating = cogenHPSendoutRating;
		cogenHPSendoutRating = newCogenHPSendoutRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING, oldCogenHPSendoutRating, cogenHPSendoutRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThermalGeneratingUnit> getThermalGeneratingUnits() {
		if (thermalGeneratingUnits == null) {
			thermalGeneratingUnits = new EObjectWithInverseResolvingEList<ThermalGeneratingUnit>(ThermalGeneratingUnit.class, this, ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT);
		}
		return thermalGeneratingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCogenLPSendoutRating() {
		return cogenLPSendoutRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCogenLPSendoutRating(float newCogenLPSendoutRating) {
		float oldCogenLPSendoutRating = cogenLPSendoutRating;
		cogenLPSendoutRating = newCogenLPSendoutRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING, oldCogenLPSendoutRating, cogenLPSendoutRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedP() {
		return ratedP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedP(float newRatedP) {
		float oldRatedP = ratedP;
		ratedP = newRatedP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.COGENERATION_PLANT__RATED_P, oldRatedP, ratedP));
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
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				if (steamSendoutSchedule != null)
					msgs = ((InternalEObject)steamSendoutSchedule).eInverseRemove(this, ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs);
				return basicSetSteamSendoutSchedule((SteamSendoutSchedule)otherEnd, msgs);
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThermalGeneratingUnits()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				return basicSetSteamSendoutSchedule(null, msgs);
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				return ((InternalEList<?>)getThermalGeneratingUnits()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
				return getCogenLPSteamRating();
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
				return getCogenHPSteamRating();
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				if (resolve) return getSteamSendoutSchedule();
				return basicGetSteamSendoutSchedule();
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
				return getCogenHPSendoutRating();
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				return getThermalGeneratingUnits();
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
				return getCogenLPSendoutRating();
			case ProductionPackage.COGENERATION_PLANT__RATED_P:
				return getRatedP();
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
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
				setCogenLPSteamRating((Float)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
				setCogenHPSteamRating((Float)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				setSteamSendoutSchedule((SteamSendoutSchedule)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
				setCogenHPSendoutRating((Float)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				getThermalGeneratingUnits().clear();
				getThermalGeneratingUnits().addAll((Collection<? extends ThermalGeneratingUnit>)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
				setCogenLPSendoutRating((Float)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__RATED_P:
				setRatedP((Float)newValue);
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
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
				setCogenLPSteamRating(COGEN_LP_STEAM_RATING_EDEFAULT);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
				setCogenHPSteamRating(COGEN_HP_STEAM_RATING_EDEFAULT);
				return;
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				setSteamSendoutSchedule((SteamSendoutSchedule)null);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
				setCogenHPSendoutRating(COGEN_HP_SENDOUT_RATING_EDEFAULT);
				return;
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				getThermalGeneratingUnits().clear();
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
				setCogenLPSendoutRating(COGEN_LP_SENDOUT_RATING_EDEFAULT);
				return;
			case ProductionPackage.COGENERATION_PLANT__RATED_P:
				setRatedP(RATED_P_EDEFAULT);
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
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
				return cogenLPSteamRating != COGEN_LP_STEAM_RATING_EDEFAULT;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
				return cogenHPSteamRating != COGEN_HP_STEAM_RATING_EDEFAULT;
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				return steamSendoutSchedule != null;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
				return cogenHPSendoutRating != COGEN_HP_SENDOUT_RATING_EDEFAULT;
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				return thermalGeneratingUnits != null && !thermalGeneratingUnits.isEmpty();
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
				return cogenLPSendoutRating != COGEN_LP_SENDOUT_RATING_EDEFAULT;
			case ProductionPackage.COGENERATION_PLANT__RATED_P:
				return ratedP != RATED_P_EDEFAULT;
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
		result.append(" (cogenLPSteamRating: ");
		result.append(cogenLPSteamRating);
		result.append(", cogenHPSteamRating: ");
		result.append(cogenHPSteamRating);
		result.append(", cogenHPSendoutRating: ");
		result.append(cogenHPSendoutRating);
		result.append(", cogenLPSendoutRating: ");
		result.append(cogenLPSendoutRating);
		result.append(", ratedP: ");
		result.append(ratedP);
		result.append(')');
		return result.toString();
	}

} //CogenerationPlantImpl
