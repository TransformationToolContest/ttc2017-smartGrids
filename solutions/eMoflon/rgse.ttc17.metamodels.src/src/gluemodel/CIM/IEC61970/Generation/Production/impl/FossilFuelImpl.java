/**
 */
package gluemodel.CIM.IEC61970.Generation.Production.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Generation.Production.FossilFuel;
import gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule;
import gluemodel.CIM.IEC61970.Generation.Production.FuelType;
import gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage;
import gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit;

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
 * An implementation of the model object '<em><b>Fossil Fuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getFuelEffFactor <em>Fuel Eff Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getFossilFuelType <em>Fossil Fuel Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getFuelMixture <em>Fuel Mixture</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getFuelCost <em>Fuel Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getLowBreakpointP <em>Low Breakpoint P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getFuelHandlingCost <em>Fuel Handling Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getFuelSulfur <em>Fuel Sulfur</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getFuelHeatContent <em>Fuel Heat Content</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getHighBreakpointP <em>High Breakpoint P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.FossilFuelImpl#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FossilFuelImpl extends IdentifiedObjectImpl implements FossilFuel {
	/**
	 * The default value of the '{@link #getFuelEffFactor() <em>Fuel Eff Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelEffFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_EFF_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelEffFactor() <em>Fuel Eff Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelEffFactor()
	 * @generated
	 * @ordered
	 */
	protected float fuelEffFactor = FUEL_EFF_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFossilFuelType() <em>Fossil Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFossilFuelType()
	 * @generated
	 * @ordered
	 */
	protected static final FuelType FOSSIL_FUEL_TYPE_EDEFAULT = FuelType.OIL;

	/**
	 * The cached value of the '{@link #getFossilFuelType() <em>Fossil Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFossilFuelType()
	 * @generated
	 * @ordered
	 */
	protected FuelType fossilFuelType = FOSSIL_FUEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelMixture() <em>Fuel Mixture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelMixture()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_MIXTURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelMixture() <em>Fuel Mixture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelMixture()
	 * @generated
	 * @ordered
	 */
	protected float fuelMixture = FUEL_MIXTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelCost() <em>Fuel Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelCost() <em>Fuel Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelCost()
	 * @generated
	 * @ordered
	 */
	protected float fuelCost = FUEL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowBreakpointP() <em>Low Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowBreakpointP()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_BREAKPOINT_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowBreakpointP() <em>Low Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowBreakpointP()
	 * @generated
	 * @ordered
	 */
	protected float lowBreakpointP = LOW_BREAKPOINT_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelHandlingCost() <em>Fuel Handling Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelHandlingCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_HANDLING_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelHandlingCost() <em>Fuel Handling Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelHandlingCost()
	 * @generated
	 * @ordered
	 */
	protected float fuelHandlingCost = FUEL_HANDLING_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFuelAllocationSchedules() <em>Fuel Allocation Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelAllocationSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<FuelAllocationSchedule> fuelAllocationSchedules;

	/**
	 * The default value of the '{@link #getFuelSulfur() <em>Fuel Sulfur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSulfur()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_SULFUR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelSulfur() <em>Fuel Sulfur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSulfur()
	 * @generated
	 * @ordered
	 */
	protected float fuelSulfur = FUEL_SULFUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ThermalGeneratingUnit thermalGeneratingUnit;

	/**
	 * The default value of the '{@link #getFuelHeatContent() <em>Fuel Heat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelHeatContent()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_HEAT_CONTENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelHeatContent() <em>Fuel Heat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelHeatContent()
	 * @generated
	 * @ordered
	 */
	protected float fuelHeatContent = FUEL_HEAT_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighBreakpointP() <em>High Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighBreakpointP()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_BREAKPOINT_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighBreakpointP() <em>High Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighBreakpointP()
	 * @generated
	 * @ordered
	 */
	protected float highBreakpointP = HIGH_BREAKPOINT_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelDispatchCost() <em>Fuel Dispatch Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelDispatchCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_DISPATCH_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelDispatchCost() <em>Fuel Dispatch Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelDispatchCost()
	 * @generated
	 * @ordered
	 */
	protected float fuelDispatchCost = FUEL_DISPATCH_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FossilFuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.FOSSIL_FUEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelEffFactor() {
		return fuelEffFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelEffFactor(float newFuelEffFactor) {
		float oldFuelEffFactor = fuelEffFactor;
		fuelEffFactor = newFuelEffFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR, oldFuelEffFactor, fuelEffFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuelType getFossilFuelType() {
		return fossilFuelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFossilFuelType(FuelType newFossilFuelType) {
		FuelType oldFossilFuelType = fossilFuelType;
		fossilFuelType = newFossilFuelType == null ? FOSSIL_FUEL_TYPE_EDEFAULT : newFossilFuelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE, oldFossilFuelType, fossilFuelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelMixture() {
		return fuelMixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelMixture(float newFuelMixture) {
		float oldFuelMixture = fuelMixture;
		fuelMixture = newFuelMixture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__FUEL_MIXTURE, oldFuelMixture, fuelMixture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelCost() {
		return fuelCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelCost(float newFuelCost) {
		float oldFuelCost = fuelCost;
		fuelCost = newFuelCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__FUEL_COST, oldFuelCost, fuelCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowBreakpointP() {
		return lowBreakpointP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowBreakpointP(float newLowBreakpointP) {
		float oldLowBreakpointP = lowBreakpointP;
		lowBreakpointP = newLowBreakpointP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P, oldLowBreakpointP, lowBreakpointP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelHandlingCost() {
		return fuelHandlingCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelHandlingCost(float newFuelHandlingCost) {
		float oldFuelHandlingCost = fuelHandlingCost;
		fuelHandlingCost = newFuelHandlingCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__FUEL_HANDLING_COST, oldFuelHandlingCost, fuelHandlingCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuelAllocationSchedule> getFuelAllocationSchedules() {
		if (fuelAllocationSchedules == null) {
			fuelAllocationSchedules = new EObjectWithInverseResolvingEList<FuelAllocationSchedule>(FuelAllocationSchedule.class, this, ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES, ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL);
		}
		return fuelAllocationSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelSulfur() {
		return fuelSulfur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelSulfur(float newFuelSulfur) {
		float oldFuelSulfur = fuelSulfur;
		fuelSulfur = newFuelSulfur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__FUEL_SULFUR, oldFuelSulfur, fuelSulfur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit getThermalGeneratingUnit() {
		if (thermalGeneratingUnit != null && thermalGeneratingUnit.eIsProxy()) {
			InternalEObject oldThermalGeneratingUnit = (InternalEObject)thermalGeneratingUnit;
			thermalGeneratingUnit = (ThermalGeneratingUnit)eResolveProxy(oldThermalGeneratingUnit);
			if (thermalGeneratingUnit != oldThermalGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, thermalGeneratingUnit));
			}
		}
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit basicGetThermalGeneratingUnit() {
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit, NotificationChain msgs) {
		ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
		thermalGeneratingUnit = newThermalGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, newThermalGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit) {
		if (newThermalGeneratingUnit != thermalGeneratingUnit) {
			NotificationChain msgs = null;
			if (thermalGeneratingUnit != null)
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT, newThermalGeneratingUnit, newThermalGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelHeatContent() {
		return fuelHeatContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelHeatContent(float newFuelHeatContent) {
		float oldFuelHeatContent = fuelHeatContent;
		fuelHeatContent = newFuelHeatContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT, oldFuelHeatContent, fuelHeatContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHighBreakpointP() {
		return highBreakpointP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighBreakpointP(float newHighBreakpointP) {
		float oldHighBreakpointP = highBreakpointP;
		highBreakpointP = newHighBreakpointP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P, oldHighBreakpointP, highBreakpointP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFuelDispatchCost() {
		return fuelDispatchCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelDispatchCost(float newFuelDispatchCost) {
		float oldFuelDispatchCost = fuelDispatchCost;
		fuelDispatchCost = newFuelDispatchCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST, oldFuelDispatchCost, fuelDispatchCost));
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFuelAllocationSchedules()).basicAdd(otherEnd, msgs);
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs);
				return basicSetThermalGeneratingUnit((ThermalGeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				return ((InternalEList<?>)getFuelAllocationSchedules()).basicRemove(otherEnd, msgs);
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				return basicSetThermalGeneratingUnit(null, msgs);
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
				return getFuelEffFactor();
			case ProductionPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
				return getFossilFuelType();
			case ProductionPackage.FOSSIL_FUEL__FUEL_MIXTURE:
				return getFuelMixture();
			case ProductionPackage.FOSSIL_FUEL__FUEL_COST:
				return getFuelCost();
			case ProductionPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
				return getLowBreakpointP();
			case ProductionPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
				return getFuelHandlingCost();
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				return getFuelAllocationSchedules();
			case ProductionPackage.FOSSIL_FUEL__FUEL_SULFUR:
				return getFuelSulfur();
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
			case ProductionPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
				return getFuelHeatContent();
			case ProductionPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
				return getHighBreakpointP();
			case ProductionPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
				return getFuelDispatchCost();
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
				setFuelEffFactor((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
				setFossilFuelType((FuelType)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_MIXTURE:
				setFuelMixture((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_COST:
				setFuelCost((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
				setLowBreakpointP((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
				setFuelHandlingCost((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				getFuelAllocationSchedules().clear();
				getFuelAllocationSchedules().addAll((Collection<? extends FuelAllocationSchedule>)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_SULFUR:
				setFuelSulfur((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
				setFuelHeatContent((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
				setHighBreakpointP((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
				setFuelDispatchCost((Float)newValue);
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
				setFuelEffFactor(FUEL_EFF_FACTOR_EDEFAULT);
				return;
			case ProductionPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
				setFossilFuelType(FOSSIL_FUEL_TYPE_EDEFAULT);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_MIXTURE:
				setFuelMixture(FUEL_MIXTURE_EDEFAULT);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_COST:
				setFuelCost(FUEL_COST_EDEFAULT);
				return;
			case ProductionPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
				setLowBreakpointP(LOW_BREAKPOINT_P_EDEFAULT);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
				setFuelHandlingCost(FUEL_HANDLING_COST_EDEFAULT);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				getFuelAllocationSchedules().clear();
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_SULFUR:
				setFuelSulfur(FUEL_SULFUR_EDEFAULT);
				return;
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
				setFuelHeatContent(FUEL_HEAT_CONTENT_EDEFAULT);
				return;
			case ProductionPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
				setHighBreakpointP(HIGH_BREAKPOINT_P_EDEFAULT);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
				setFuelDispatchCost(FUEL_DISPATCH_COST_EDEFAULT);
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
				return fuelEffFactor != FUEL_EFF_FACTOR_EDEFAULT;
			case ProductionPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
				return fossilFuelType != FOSSIL_FUEL_TYPE_EDEFAULT;
			case ProductionPackage.FOSSIL_FUEL__FUEL_MIXTURE:
				return fuelMixture != FUEL_MIXTURE_EDEFAULT;
			case ProductionPackage.FOSSIL_FUEL__FUEL_COST:
				return fuelCost != FUEL_COST_EDEFAULT;
			case ProductionPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
				return lowBreakpointP != LOW_BREAKPOINT_P_EDEFAULT;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
				return fuelHandlingCost != FUEL_HANDLING_COST_EDEFAULT;
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				return fuelAllocationSchedules != null && !fuelAllocationSchedules.isEmpty();
			case ProductionPackage.FOSSIL_FUEL__FUEL_SULFUR:
				return fuelSulfur != FUEL_SULFUR_EDEFAULT;
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
				return fuelHeatContent != FUEL_HEAT_CONTENT_EDEFAULT;
			case ProductionPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
				return highBreakpointP != HIGH_BREAKPOINT_P_EDEFAULT;
			case ProductionPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
				return fuelDispatchCost != FUEL_DISPATCH_COST_EDEFAULT;
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
		result.append(" (fuelEffFactor: ");
		result.append(fuelEffFactor);
		result.append(", fossilFuelType: ");
		result.append(fossilFuelType);
		result.append(", fuelMixture: ");
		result.append(fuelMixture);
		result.append(", fuelCost: ");
		result.append(fuelCost);
		result.append(", lowBreakpointP: ");
		result.append(lowBreakpointP);
		result.append(", fuelHandlingCost: ");
		result.append(fuelHandlingCost);
		result.append(", fuelSulfur: ");
		result.append(fuelSulfur);
		result.append(", fuelHeatContent: ");
		result.append(fuelHeatContent);
		result.append(", highBreakpointP: ");
		result.append(highBreakpointP);
		result.append(", fuelDispatchCost: ");
		result.append(fuelDispatchCost);
		result.append(')');
		return result.toString();
	}

} //FossilFuelImpl
