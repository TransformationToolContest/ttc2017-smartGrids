/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.Generation.Production.CombinedCyclePlant;
import CIM.IEC61970.Generation.Production.ProductionPackage;
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
 * An implementation of the model object '<em><b>Combined Cycle Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.CombinedCyclePlantImpl#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.CombinedCyclePlantImpl#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedCyclePlantImpl extends PowerSystemResourceImpl implements CombinedCyclePlant {
	/**
	 * The default value of the '{@link #getCombCyclePlantRating() <em>Comb Cycle Plant Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombCyclePlantRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COMB_CYCLE_PLANT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCombCyclePlantRating() <em>Comb Cycle Plant Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombCyclePlantRating()
	 * @generated
	 * @ordered
	 */
	protected float combCyclePlantRating = COMB_CYCLE_PLANT_RATING_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedCyclePlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.COMBINED_CYCLE_PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCombCyclePlantRating() {
		return combCyclePlantRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombCyclePlantRating(float newCombCyclePlantRating) {
		float oldCombCyclePlantRating = combCyclePlantRating;
		combCyclePlantRating = newCombCyclePlantRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING, oldCombCyclePlantRating, combCyclePlantRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThermalGeneratingUnit> getThermalGeneratingUnits() {
		if (thermalGeneratingUnits == null) {
			thermalGeneratingUnits = new EObjectWithInverseResolvingEList<ThermalGeneratingUnit>(ThermalGeneratingUnit.class, this, ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT);
		}
		return thermalGeneratingUnits;
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
				return getCombCyclePlantRating();
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				return getThermalGeneratingUnits();
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
				setCombCyclePlantRating((Float)newValue);
				return;
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				getThermalGeneratingUnits().clear();
				getThermalGeneratingUnits().addAll((Collection<? extends ThermalGeneratingUnit>)newValue);
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
				setCombCyclePlantRating(COMB_CYCLE_PLANT_RATING_EDEFAULT);
				return;
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				getThermalGeneratingUnits().clear();
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
				return combCyclePlantRating != COMB_CYCLE_PLANT_RATING_EDEFAULT;
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				return thermalGeneratingUnits != null && !thermalGeneratingUnits.isEmpty();
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
		result.append(" (combCyclePlantRating: ");
		result.append(combCyclePlantRating);
		result.append(')');
		return result.toString();
	}

} //CombinedCyclePlantImpl
