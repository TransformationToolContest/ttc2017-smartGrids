/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Generation.Production.HydroEnergyConversionKind;
import CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve;
import CIM.IEC61970.Generation.Production.HydroGeneratingUnit;
import CIM.IEC61970.Generation.Production.HydroPowerPlant;
import CIM.IEC61970.Generation.Production.PenstockLossCurve;
import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.TailbayLossCurve;

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
 * An implementation of the model object '<em><b>Hydro Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl#getEnergyConversionCapability <em>Energy Conversion Capability</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl#getTailbayLossCurve <em>Tailbay Loss Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroGeneratingUnitImpl#getPenstockLossCurve <em>Penstock Loss Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroGeneratingUnitImpl extends GeneratingUnitImpl implements HydroGeneratingUnit {
	/**
	 * The default value of the '{@link #getEnergyConversionCapability() <em>Energy Conversion Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConversionCapability()
	 * @generated
	 * @ordered
	 */
	protected static final HydroEnergyConversionKind ENERGY_CONVERSION_CAPABILITY_EDEFAULT = HydroEnergyConversionKind.PUMP_AND_GENERATOR;

	/**
	 * The cached value of the '{@link #getEnergyConversionCapability() <em>Energy Conversion Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConversionCapability()
	 * @generated
	 * @ordered
	 */
	protected HydroEnergyConversionKind energyConversionCapability = ENERGY_CONVERSION_CAPABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTailbayLossCurve() <em>Tailbay Loss Curve</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailbayLossCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<TailbayLossCurve> tailbayLossCurve;

	/**
	 * The cached value of the '{@link #getHydroPowerPlant() <em>Hydro Power Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPowerPlant()
	 * @generated
	 * @ordered
	 */
	protected HydroPowerPlant hydroPowerPlant;

	/**
	 * The cached value of the '{@link #getHydroGeneratingEfficiencyCurves() <em>Hydro Generating Efficiency Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroGeneratingEfficiencyCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroGeneratingEfficiencyCurve> hydroGeneratingEfficiencyCurves;

	/**
	 * The default value of the '{@link #getHydroUnitWaterCost() <em>Hydro Unit Water Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroUnitWaterCost()
	 * @generated
	 * @ordered
	 */
	protected static final float HYDRO_UNIT_WATER_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHydroUnitWaterCost() <em>Hydro Unit Water Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroUnitWaterCost()
	 * @generated
	 * @ordered
	 */
	protected float hydroUnitWaterCost = HYDRO_UNIT_WATER_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPenstockLossCurve() <em>Penstock Loss Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenstockLossCurve()
	 * @generated
	 * @ordered
	 */
	protected PenstockLossCurve penstockLossCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroGeneratingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HYDRO_GENERATING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroEnergyConversionKind getEnergyConversionCapability() {
		return energyConversionCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyConversionCapability(HydroEnergyConversionKind newEnergyConversionCapability) {
		HydroEnergyConversionKind oldEnergyConversionCapability = energyConversionCapability;
		energyConversionCapability = newEnergyConversionCapability == null ? ENERGY_CONVERSION_CAPABILITY_EDEFAULT : newEnergyConversionCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY, oldEnergyConversionCapability, energyConversionCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TailbayLossCurve> getTailbayLossCurve() {
		if (tailbayLossCurve == null) {
			tailbayLossCurve = new EObjectWithInverseResolvingEList<TailbayLossCurve>(TailbayLossCurve.class, this, ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE, ProductionPackage.TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT);
		}
		return tailbayLossCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPowerPlant getHydroPowerPlant() {
		if (hydroPowerPlant != null && hydroPowerPlant.eIsProxy()) {
			InternalEObject oldHydroPowerPlant = (InternalEObject)hydroPowerPlant;
			hydroPowerPlant = (HydroPowerPlant)eResolveProxy(oldHydroPowerPlant);
			if (hydroPowerPlant != oldHydroPowerPlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, oldHydroPowerPlant, hydroPowerPlant));
			}
		}
		return hydroPowerPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPowerPlant basicGetHydroPowerPlant() {
		return hydroPowerPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPowerPlant(HydroPowerPlant newHydroPowerPlant, NotificationChain msgs) {
		HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
		hydroPowerPlant = newHydroPowerPlant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, oldHydroPowerPlant, newHydroPowerPlant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroPowerPlant(HydroPowerPlant newHydroPowerPlant) {
		if (newHydroPowerPlant != hydroPowerPlant) {
			NotificationChain msgs = null;
			if (hydroPowerPlant != null)
				msgs = ((InternalEObject)hydroPowerPlant).eInverseRemove(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs);
			if (newHydroPowerPlant != null)
				msgs = ((InternalEObject)newHydroPowerPlant).eInverseAdd(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs);
			msgs = basicSetHydroPowerPlant(newHydroPowerPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, newHydroPowerPlant, newHydroPowerPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HydroGeneratingEfficiencyCurve> getHydroGeneratingEfficiencyCurves() {
		if (hydroGeneratingEfficiencyCurves == null) {
			hydroGeneratingEfficiencyCurves = new EObjectWithInverseResolvingEList<HydroGeneratingEfficiencyCurve>(HydroGeneratingEfficiencyCurve.class, this, ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES, ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT);
		}
		return hydroGeneratingEfficiencyCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHydroUnitWaterCost() {
		return hydroUnitWaterCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroUnitWaterCost(float newHydroUnitWaterCost) {
		float oldHydroUnitWaterCost = hydroUnitWaterCost;
		hydroUnitWaterCost = newHydroUnitWaterCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST, oldHydroUnitWaterCost, hydroUnitWaterCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenstockLossCurve getPenstockLossCurve() {
		if (penstockLossCurve != null && penstockLossCurve.eIsProxy()) {
			InternalEObject oldPenstockLossCurve = (InternalEObject)penstockLossCurve;
			penstockLossCurve = (PenstockLossCurve)eResolveProxy(oldPenstockLossCurve);
			if (penstockLossCurve != oldPenstockLossCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE, oldPenstockLossCurve, penstockLossCurve));
			}
		}
		return penstockLossCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenstockLossCurve basicGetPenstockLossCurve() {
		return penstockLossCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPenstockLossCurve(PenstockLossCurve newPenstockLossCurve, NotificationChain msgs) {
		PenstockLossCurve oldPenstockLossCurve = penstockLossCurve;
		penstockLossCurve = newPenstockLossCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE, oldPenstockLossCurve, newPenstockLossCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenstockLossCurve(PenstockLossCurve newPenstockLossCurve) {
		if (newPenstockLossCurve != penstockLossCurve) {
			NotificationChain msgs = null;
			if (penstockLossCurve != null)
				msgs = ((InternalEObject)penstockLossCurve).eInverseRemove(this, ProductionPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs);
			if (newPenstockLossCurve != null)
				msgs = ((InternalEObject)newPenstockLossCurve).eInverseAdd(this, ProductionPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs);
			msgs = basicSetPenstockLossCurve(newPenstockLossCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE, newPenstockLossCurve, newPenstockLossCurve));
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTailbayLossCurve()).basicAdd(otherEnd, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				if (hydroPowerPlant != null)
					msgs = ((InternalEObject)hydroPowerPlant).eInverseRemove(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs);
				return basicSetHydroPowerPlant((HydroPowerPlant)otherEnd, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHydroGeneratingEfficiencyCurves()).basicAdd(otherEnd, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				if (penstockLossCurve != null)
					msgs = ((InternalEObject)penstockLossCurve).eInverseRemove(this, ProductionPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs);
				return basicSetPenstockLossCurve((PenstockLossCurve)otherEnd, msgs);
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				return ((InternalEList<?>)getTailbayLossCurve()).basicRemove(otherEnd, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				return basicSetHydroPowerPlant(null, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				return ((InternalEList<?>)getHydroGeneratingEfficiencyCurves()).basicRemove(otherEnd, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				return basicSetPenstockLossCurve(null, msgs);
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
				return getEnergyConversionCapability();
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				return getTailbayLossCurve();
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				if (resolve) return getHydroPowerPlant();
				return basicGetHydroPowerPlant();
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				return getHydroGeneratingEfficiencyCurves();
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
				return getHydroUnitWaterCost();
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				if (resolve) return getPenstockLossCurve();
				return basicGetPenstockLossCurve();
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
				setEnergyConversionCapability((HydroEnergyConversionKind)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				getTailbayLossCurve().clear();
				getTailbayLossCurve().addAll((Collection<? extends TailbayLossCurve>)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				setHydroPowerPlant((HydroPowerPlant)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				getHydroGeneratingEfficiencyCurves().clear();
				getHydroGeneratingEfficiencyCurves().addAll((Collection<? extends HydroGeneratingEfficiencyCurve>)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
				setHydroUnitWaterCost((Float)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				setPenstockLossCurve((PenstockLossCurve)newValue);
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
				setEnergyConversionCapability(ENERGY_CONVERSION_CAPABILITY_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				getTailbayLossCurve().clear();
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				setHydroPowerPlant((HydroPowerPlant)null);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				getHydroGeneratingEfficiencyCurves().clear();
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
				setHydroUnitWaterCost(HYDRO_UNIT_WATER_COST_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				setPenstockLossCurve((PenstockLossCurve)null);
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
				return energyConversionCapability != ENERGY_CONVERSION_CAPABILITY_EDEFAULT;
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				return tailbayLossCurve != null && !tailbayLossCurve.isEmpty();
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				return hydroPowerPlant != null;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				return hydroGeneratingEfficiencyCurves != null && !hydroGeneratingEfficiencyCurves.isEmpty();
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
				return hydroUnitWaterCost != HYDRO_UNIT_WATER_COST_EDEFAULT;
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				return penstockLossCurve != null;
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
		result.append(" (energyConversionCapability: ");
		result.append(energyConversionCapability);
		result.append(", hydroUnitWaterCost: ");
		result.append(hydroUnitWaterCost);
		result.append(')');
		return result.toString();
	}

} //HydroGeneratingUnitImpl
