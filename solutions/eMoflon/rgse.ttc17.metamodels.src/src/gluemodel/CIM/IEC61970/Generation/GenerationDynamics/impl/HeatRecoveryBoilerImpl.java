/**
 */
package gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl;

import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine;
import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;
import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler;

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
 * An implementation of the model object '<em><b>Heat Recovery Boiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HeatRecoveryBoilerImpl#getCombustionTurbines <em>Combustion Turbines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.impl.HeatRecoveryBoilerImpl#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeatRecoveryBoilerImpl extends FossilSteamSupplyImpl implements HeatRecoveryBoiler {
	/**
	 * The cached value of the '{@link #getCombustionTurbines() <em>Combustion Turbines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTurbines()
	 * @generated
	 * @ordered
	 */
	protected EList<CombustionTurbine> combustionTurbines;

	/**
	 * The default value of the '{@link #getSteamSupplyRating2() <em>Steam Supply Rating2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplyRating2()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_SUPPLY_RATING2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamSupplyRating2() <em>Steam Supply Rating2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplyRating2()
	 * @generated
	 * @ordered
	 */
	protected float steamSupplyRating2 = STEAM_SUPPLY_RATING2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeatRecoveryBoilerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.HEAT_RECOVERY_BOILER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CombustionTurbine> getCombustionTurbines() {
		if (combustionTurbines == null) {
			combustionTurbines = new EObjectWithInverseResolvingEList<CombustionTurbine>(CombustionTurbine.class, this, GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER);
		}
		return combustionTurbines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSteamSupplyRating2() {
		return steamSupplyRating2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteamSupplyRating2(float newSteamSupplyRating2) {
		float oldSteamSupplyRating2 = steamSupplyRating2;
		steamSupplyRating2 = newSteamSupplyRating2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2, oldSteamSupplyRating2, steamSupplyRating2));
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCombustionTurbines()).basicAdd(otherEnd, msgs);
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				return ((InternalEList<?>)getCombustionTurbines()).basicRemove(otherEnd, msgs);
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				return getCombustionTurbines();
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
				return getSteamSupplyRating2();
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				getCombustionTurbines().clear();
				getCombustionTurbines().addAll((Collection<? extends CombustionTurbine>)newValue);
				return;
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
				setSteamSupplyRating2((Float)newValue);
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				getCombustionTurbines().clear();
				return;
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
				setSteamSupplyRating2(STEAM_SUPPLY_RATING2_EDEFAULT);
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				return combustionTurbines != null && !combustionTurbines.isEmpty();
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
				return steamSupplyRating2 != STEAM_SUPPLY_RATING2_EDEFAULT;
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
		result.append(" (steamSupplyRating2: ");
		result.append(steamSupplyRating2);
		result.append(')');
		return result.toString();
	}

} //HeatRecoveryBoilerImpl
