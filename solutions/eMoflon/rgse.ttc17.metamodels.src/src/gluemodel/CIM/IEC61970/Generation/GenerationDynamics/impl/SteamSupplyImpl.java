/**
 */
package gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl;

import gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;
import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamSupply;
import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine;

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
 * An implementation of the model object '<em><b>Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamSupplyImpl#getSteamTurbines <em>Steam Turbines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.SteamSupplyImpl#getSteamSupplyRating <em>Steam Supply Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SteamSupplyImpl extends PowerSystemResourceImpl implements SteamSupply {
	/**
	 * The cached value of the '{@link #getSteamTurbines() <em>Steam Turbines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamTurbines()
	 * @generated
	 * @ordered
	 */
	protected EList<SteamTurbine> steamTurbines;

	/**
	 * The default value of the '{@link #getSteamSupplyRating() <em>Steam Supply Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplyRating()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_SUPPLY_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamSupplyRating() <em>Steam Supply Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplyRating()
	 * @generated
	 * @ordered
	 */
	protected float steamSupplyRating = STEAM_SUPPLY_RATING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SteamSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.STEAM_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SteamTurbine> getSteamTurbines() {
		if (steamTurbines == null) {
			steamTurbines = new EObjectWithInverseResolvingEList.ManyInverse<SteamTurbine>(SteamTurbine.class, this, GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES, GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS);
		}
		return steamTurbines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSteamSupplyRating() {
		return steamSupplyRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteamSupplyRating(float newSteamSupplyRating) {
		float oldSteamSupplyRating = steamSupplyRating;
		steamSupplyRating = newSteamSupplyRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING, oldSteamSupplyRating, steamSupplyRating));
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteamTurbines()).basicAdd(otherEnd, msgs);
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				return ((InternalEList<?>)getSteamTurbines()).basicRemove(otherEnd, msgs);
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				return getSteamTurbines();
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
				return getSteamSupplyRating();
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				getSteamTurbines().clear();
				getSteamTurbines().addAll((Collection<? extends SteamTurbine>)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
				setSteamSupplyRating((Float)newValue);
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				getSteamTurbines().clear();
				return;
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
				setSteamSupplyRating(STEAM_SUPPLY_RATING_EDEFAULT);
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				return steamTurbines != null && !steamTurbines.isEmpty();
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
				return steamSupplyRating != STEAM_SUPPLY_RATING_EDEFAULT;
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
		result.append(" (steamSupplyRating: ");
		result.append(steamSupplyRating);
		result.append(')');
		return result.toString();
	}

} //SteamSupplyImpl
